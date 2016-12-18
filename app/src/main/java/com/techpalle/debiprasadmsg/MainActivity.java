package com.techpalle.debiprasadmsg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQ_CD1=1;
EditText et;
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("msg", et.getText().toString());
                startActivityForResult(intent, REQ_CD1);

            }
        });
    }

        @Override
        protected void onActivityResult(int requestcode,int resultcode,Intent intent) {


            if(requestcode==REQ_CD1);{
                if(resultcode==RESULT_OK){

                    Bundle bn=intent.getExtras();
                    String val=bn.getString("b");
                    tv.setText(""+val);


                }
            }

        }



    }





