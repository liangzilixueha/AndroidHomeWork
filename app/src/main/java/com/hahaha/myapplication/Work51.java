package com.hahaha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Work51 extends AppCompatActivity {
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName4;
    private EditText editTextTextPersonName5;
    private RadioGroup radioGroup2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work51);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        textView3 = (TextView) findViewById(R.id.textView3);
    }

    public void submit(View view) {
        String name = editTextTextPersonName2.getText().toString();
        String Class = editTextTextPersonName4.getText().toString();
        String id = editTextTextPersonName5.getText().toString();
        String rel = "";
        //如果checkBox3被选中，加入其中的文字
        if (checkBox3.isChecked())
            rel += checkBox3.getText().toString() + name+"\n";
        else
            rel += "\n";
        //如果checkBox4被选中，加入其中的文字
        if (checkBox4.isChecked())
            rel += checkBox4.getText().toString() + Class+"\n";
        else
            rel += "\n";
        //如果checkBox5被选中，加入其中的文字
        if (checkBox5.isChecked())
            rel += checkBox5.getText().toString() + id;
        else
            rel += "\n";
        textView3.setText(rel);
    }
}