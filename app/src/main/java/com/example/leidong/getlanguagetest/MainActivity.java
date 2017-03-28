package com.example.leidong.getlanguagetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件
        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取当前系统的语言
                String languageInfo = Locale.getDefault().getLanguage().toString();
                //获取当前语言对应的国家
                String country = getResources().getConfiguration().locale.getCountry();
                textView.setText(languageInfo + "\n" + country);
            }
        });
    }

    /**
     * 获取控件
     */
    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
    }
}
