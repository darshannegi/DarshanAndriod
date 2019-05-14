MainActivity

package com.example.doubleintent;
import android.content.Intent;
import android.support.v4.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    TextView r1;
    Button b;
    Intent i,x;
    final static int REQUESTCODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editText2);
        t2=findViewById(R.id.editText);
        r1=findViewById(R.id.textView2);
        b=findViewById(R.id.button);
        i=new Intent(MainActivity.this,Main2Activity.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(t1.getText().toString());
                int b=Integer.parseInt(t2.getText().toString());
                i.putExtra("a",a+"");
                i.putExtra("b",b+"");
                startActivityForResult(i, REQUESTCODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK){
           int rs=data.getIntExtra("result",0);
            r1.setText(" Answer is :    "+rs+"");
        }
    }
}


Main2Activity

package com.example.doubleintent;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    Intent i,x;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=getIntent();
                int a=Integer.parseInt(i.getStringExtra("a").toString());
                int b=Integer.parseInt(i.getStringExtra("b").toString());
                int rs=a+b;
                x=new Intent(Main2Activity.this,MainActivity.class);
                x.putExtra("result",rs);
                setResult(RESULT_OK,x);
                finish();
            }
        });
    }
}
