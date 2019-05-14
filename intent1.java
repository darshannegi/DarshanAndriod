MainActivity

package com.example.form;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText2);
        e2 = findViewById(R.id.editText4);
        e3 = findViewById(R.id.editText);
        e4 = findViewById(R.id.editText6);
        e5 = findViewById(R.id.editText3);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("name", e1.getText().toString());
                i.putExtra("rollno", e2.getText().toString());
                i.putExtra("course", e3.getText().toString());
                i.putExtra("year", e4.getText().toString());
                i.putExtra("college", e5.getText().toString());
                startActivity(i);
            }
        });
    }
}
Main2Activity

package com.example.form;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView10);
        t2=findViewById(R.id.textView5);
        t3=findViewById(R.id.textView7);
        t4=findViewById(R.id.textView8);
        t5=findViewById(R.id.textView9);
        Intent x=getIntent();
        t1.setText( x.getStringExtra("name"));
        t2.setText( x.getStringExtra("rollno"));
        t3.setText( x.getStringExtra("course"));
        t4.setText( x.getStringExtra("year"));
        t5.setText( x.getStringExtra("college"));
    }
}
