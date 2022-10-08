package com.hahaha.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Work53 extends AppCompatActivity {

    private TextView textView2;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work53);
        textView2 = (TextView) findViewById(R.id.textView2);
        listView = (ListView) findViewById(R.id.listView);
        //给listView添加最基本的文字适配器
        listView.setAdapter(new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,//这个布局是系统自带的
                        new String[]{"博士", "硕士", "学士", "专科"}
                )
        );
        //设置点击事件
        listView.setOnItemClickListener((parent, view, position, id) -> {
            //根据position判断点击的是哪个item
            switch (position) {
                case 0:
                    textView2.setText("博士,点击了第" + id + "个");
                    break;
                case 1:
                    textView2.setText("硕士,点击了第" + id + "个");
                    break;
                case 2:
                    textView2.setText("学士,点击了第" + id + "个");
                    break;
                case 3:
                    textView2.setText("专科,点击了第" + id + "个");
                    break;
            }
        });
    }
}