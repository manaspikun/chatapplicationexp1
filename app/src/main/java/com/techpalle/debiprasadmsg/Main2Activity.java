package com.techpalle.debiprasadmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView tv1;
    EditText et1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1= (TextView) findViewById(R.id.textView1);
        et1= (EditText) findViewById(R.id.editText1);
        b1= (Button) findViewById(R.id.button1);
        Intent in=getIntent();
        Bundle bn=in.getExtras();
        String val=bn.getString("msg");
        tv1.setText(""+val);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent();
                in.putExtra("b",et1.getText().toString());
                setResult(RESULT_OK,in);
                finish();
            }
        });

        }

    }

