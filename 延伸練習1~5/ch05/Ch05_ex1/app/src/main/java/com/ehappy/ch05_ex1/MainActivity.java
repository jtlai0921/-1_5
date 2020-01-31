package com.ehappy.ch05_ex1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private CheckBox chkAndroid,chkC,chkJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 取得介面元件id
        txtResult=(TextView) findViewById(R.id.txtResult);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkC = (CheckBox) findViewById(R.id.chkC);
        chkJava = (CheckBox) findViewById(R.id.chkJava);

        // 設定 CheckBox 元件 CheckedChange 事件的  listener
        chkAndroid.setOnCheckedChangeListener(myListener);
        chkC.setOnCheckedChangeListener(myListener);
        chkJava.setOnCheckedChangeListener(myListener);
    }

    //  定義  OnCheckedChange 方法
    private CheckBox.OnCheckedChangeListener myListener=
        new CheckBox.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){
            int n=0;  // 記錄共選了多少項
            String sel="";  // 所有的選項結果
            String s1="",s2="",s3="";  // 單一選項的結果
            if(chkAndroid.isChecked()){
                n++;
                s1=chkAndroid.getText().toString() + " ";
            }else{
                s1="";
            }

            if(chkC.isChecked()){
                n++;
                s2=chkC.getText().toString() + " ";
            }else{
                s2="";
            }

            if(chkJava.isChecked()){
                n++;
                s3=chkJava.getText().toString() + " ";
            }else{
                s3="";
            }
            sel=s1+s2+s3;
            txtResult.setText("最喜歡的程式語言有： " + sel + "共 " + n + " 種");
        }
    };
}