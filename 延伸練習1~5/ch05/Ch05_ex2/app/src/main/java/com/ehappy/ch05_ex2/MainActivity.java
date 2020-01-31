package com.ehappy.ch05_ex2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private EditText edtName;
    private RadioButton radBloodO,radBloodA,radBloodB,radBloodAB;
    private RadioGroup radGroupBloods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 取得介面元件
        txtResult=(TextView) findViewById(R.id.txtResult);
        edtName=(EditText) findViewById(R.id.edtName);
        radGroupBloods=(RadioGroup) findViewById(R.id.radGroupBloods);
        radBloodO = (RadioButton) findViewById(R.id.radBloodO);
        radBloodA= (RadioButton) findViewById(R.id.radBloodA);
        radBloodB = (RadioButton) findViewById(R.id.radBloodB);
        radBloodAB = (RadioButton) findViewById(R.id.radBloodAB);

        // 設定 radGroupBloods 元件 CheckedChange 事件的 listener
        radGroupBloods.setOnCheckedChangeListener(myListener);
    }

    //  定義  OnCheckedChange 方法
    private RadioGroup.OnCheckedChangeListener myListener=
        new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            String name=edtName.getText().toString();
            if (checkedId == R.id.radBloodO)
                txtResult.setText(name + " 您的血型為 " +radBloodO.getText() + " 型 " );
            else if (checkedId == R.id.radBloodA)
                txtResult.setText(name + " 您的血型為 " +radBloodA.getText() + " 型 " );
            else if (checkedId == R.id.radBloodB)
                txtResult.setText(name + " 您的血型為 " +radBloodB.getText() + " 型 " );
            else if (checkedId == R.id.radBloodAB)
                txtResult.setText(name + " 您的血型為 " +radBloodAB.getText() + " 型 " );
        }
    };
}
