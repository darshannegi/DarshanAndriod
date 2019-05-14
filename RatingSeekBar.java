package com.example.callbacks;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    TextView t,t2;
    RatingBar r;
    SeekBar s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Log.d("msg1","on create called");
        t= findViewById(R.id.textView5);
        t2= findViewById(R.id.textView);
        r= findViewById(R.id.ratingBar);
        s= findViewById(R.id.seekBar);
        r.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                t.setText("Rating is : "+rating);
                Toast.makeText(MainActivity.this,rating+"",Toast.LENGTH_SHORT).show();
            }
        });
        s.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t2.setText("Progress is : "+progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("msg","called");
            }
        });
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("msg2","on start called");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("msg3","on resume called");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("msg4","on restart called");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("msg5","on pause called");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("msg6","on stop called");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("msg7","on destroy called");
    }
}
