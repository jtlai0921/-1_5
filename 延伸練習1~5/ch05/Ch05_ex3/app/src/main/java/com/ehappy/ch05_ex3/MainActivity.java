package com.ehappy.ch05_ex3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private EditText edtName;
    private Spinner spnEducation;
    String[] Balls= new String[] {"博士","碩士","大學","高中"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtResult=(TextView) findViewById(R.id.txtResult);
        spnEducation=(Spinner) findViewById(R.id.spnEducation);
        edtName=(EditText) findViewById(R.id.edtName);
        // 建立ArrayAdapter
        ArrayAdapter<String> adapterBalls=new ArrayAdapter<String>
                (this,android.R.layout.simple_spinner_item,Balls);

        // 設定Spinner顯示的格式
        adapterBalls.setDropDownViewResource(android.R.layout.
                simple_spinner_dropdown_item);

        // 設定Spinner的資料來源
        spnEducation.setAdapter(adapterBalls);

        // 設定 spnEducation 元件 ItemSelected 事件的 listener
        spnEducation.setOnItemSelectedListener(myListener);
    }

    //  定義  onItemSelected 方法
    private Spinner.OnItemSelectedListener myListener=
        new Spinner.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> parent, View v,
                                   int position, long id) {
            String name=edtName.getText().toString();
            String sel=parent.getSelectedItem().toString();
            txtResult.setText(name + " 學歷為： " + sel);
        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            // TODO Auto-generated method stub
        }
    };
}
