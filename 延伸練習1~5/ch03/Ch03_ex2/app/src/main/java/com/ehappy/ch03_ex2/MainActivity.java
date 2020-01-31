package com.ehappy.ch03_ex2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 宣告全域變數
    private TextView txtShow;
    private Button btnZero,btnOne,btnTwo,btnThree,btnFour;
    private Button btnFive,btnSix,btnSeven,btnEight,btnNine,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 取得資源類別檔中的介面元件
        txtShow=(TextView)findViewById(R.id.txtShow);
        btnZero=(Button)findViewById(R.id.btnZero);
        btnOne=(Button)findViewById(R.id.btnOne);
        btnTwo=(Button)findViewById(R.id.btnTwo);
        btnThree=(Button)findViewById(R.id.btnThree);
        btnFour=(Button)findViewById(R.id.btnFour);
        btnFive=(Button)findViewById(R.id.btnFive);
        btnSix=(Button)findViewById(R.id.btnSix);
        btnSeven=(Button)findViewById(R.id.btnSeven);
        btnEight=(Button)findViewById(R.id.btnEight);
        btnNine=(Button)findViewById(R.id.btnNine);
        btnClear=(Button)findViewById(R.id.btnClear);

        // 設定 button 元件 Click 事件共用   myListner
        btnZero.setOnClickListener(myListner);
        btnOne.setOnClickListener(myListner);
        btnTwo.setOnClickListener(myListner);
        btnThree.setOnClickListener(myListner);
        btnFour.setOnClickListener(myListner);
        btnFive.setOnClickListener(myListner);
        btnSix.setOnClickListener(myListner);
        btnSeven.setOnClickListener(myListner);
        btnEight.setOnClickListener(myListner);
        btnNine.setOnClickListener(myListner);
        btnClear.setOnClickListener(myListner);
   }

    // 定義  onClick() 方法
    private Button.OnClickListener myListner=new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            String s=txtShow.getText().toString();
            switch (v.getId()){
                case R.id.btnZero:{
                    txtShow.setText(s + "0");
                    break;
                }
                case R.id.btnOne:{
                    txtShow.setText(s + "1");
                    break;
                }
                case R.id.btnTwo:{
                    txtShow.setText(s + "2");
                    break;
                }
                case R.id.btnThree:{
                    txtShow.setText(s + "3");
                    break;
                }
                case R.id.btnFour:{
                    txtShow.setText(s + "4");
                    break;
                }
                case R.id.btnFive:{
                    txtShow.setText(s + "5");
                    break;
                }
                case R.id.btnSix:{
                    txtShow.setText(s + "6");
                    break;
                }
                case R.id.btnSeven:{
                    txtShow.setText(s + "7");
                    break;
                }
                case R.id.btnEight:{
                    txtShow.setText(s + "8");
                    break;
                }
                case R.id.btnNine:{
                    txtShow.setText(s + "9");
                    break;
                }
                case R.id.btnClear:{
                    txtShow.setText("電話號碼：");
                    break;
                }
            }
        }
    };
}
