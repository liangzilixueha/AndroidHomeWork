package com.hahaha.myapplication.Chapter8;

import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.hahaha.myapplication.R;

public class Num3 extends AppCompatActivity {

    private TextView text;
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num3);
        text = (TextView) findViewById(R.id.text);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(view -> {
            //读取本地res/raw目录下的文件
            try {
                byte[] bytes = new byte[getResources().openRawResource(R.raw.test).available()];
                getResources().openRawResource(R.raw.test).read(bytes);
                text.setText(new String(bytes));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        btn2.setOnClickListener(view -> {
            //解析assets目录下的xml文件
            try {
                //获取xml文件的解析器
                XmlResourceParser parser = getResources().getXml(R.xml.text);
                //获取事件类型
                int eventType = parser.getEventType();
                //如果不是文档结束事件
                while (eventType != XmlResourceParser.END_DOCUMENT) {

                    //如果是开始标签事件
                    if (eventType == XmlResourceParser.START_TAG) {
                        //获取标签名
                        String tagName = parser.getName();
                        //如果是name标签
                        if (tagName.equals("string")) {
                            //获取name标签的属性值
                            String name = parser.getAttributeValue(null, "name");
                            //获取name标签的内容
                            String content = parser.nextText();
                            text.setText(name + ":" + content);
                        }
                    }
                    //获取下一个事件类型
                    eventType = parser.next();
                }
            } catch (Exception e) {
                Log.e("csw", "onCreate: "+e);
            }
        });
    }
}