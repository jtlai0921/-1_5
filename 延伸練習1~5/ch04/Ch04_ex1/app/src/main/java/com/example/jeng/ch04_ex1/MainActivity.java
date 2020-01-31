package com.example.jeng.ch04_ex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //建立全域變數
    private Button btnN1, btnN2, btnN3, btnN4;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //取得介面元件
        btnN1=(Button)findViewById(R.id.btnN1);
        btnN2=(Button)findViewById(R.id.btnN2);
        btnN3=(Button)findViewById(R.id.btnN3);
        btnN4=(Button)findViewById(R.id.btnN4);
        //設定共用事件
        btnN1.setOnClickListener(listener);
        btnN2.setOnClickListener(listener);
        btnN3.setOnClickListener(listener);
        btnN4.setOnClickListener(listener);
    }

    private Button.OnClickListener listener=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.btnN1:
                    str=btnN1.getText().toString();
                    display(str);
                    break;
                case R.id.btnN2:
                    str=btnN2.getText().toString();
                    display(str);
                    break;
                case R.id.btnN3:
                    str=btnN3.getText().toString();
                    display(str);
                    break;
                case R.id.btnN4:
                    str=btnN4.getText().toString();
                    display(str);
                    break;
            }
        }
    };

    private void display(String s) {
        Toast toast=Toast.makeText(getApplicationContext(), "你按了「"+str+"！」", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
