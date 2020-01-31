package com.ehappy.ch03_ex1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 宣告全域變數
    private EditText edtNum;
    private TextView txtResult;
    private Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 取得介面元件
        edtNum=(EditText)findViewById(R.id.edtNum);
        txtResult=(TextView)findViewById(R.id.txtResult);
        btnCal=(Button)findViewById(R.id.btnCal);

        // 設定  button 元件  Click 事件的 listener
        btnCal.setOnClickListener(myListener);
    }

    private Button.OnClickListener myListener=new Button.OnClickListener(){
        public void onClick(View v){
            int n=Integer.parseInt(edtNum.getText().toString());
            int sum=0;
            for (int i=0;i<=n;i++)
                sum +=i;
            txtResult.setText("" + sum);
        }
    };
}
