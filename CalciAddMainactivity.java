package com.example.calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
   EditText e1,e2;
   Button b;
   TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText3);
        e2 = findViewById(R.id.editText2);
        b = findViewById(R.id.button);
        t = findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=Integer.parseInt(e1.getText().toString());
                int y=Integer.parseInt(e2.getText().toString());
                int d=x+y;
                t.setText(d+"");
            }
        });
    }
}
