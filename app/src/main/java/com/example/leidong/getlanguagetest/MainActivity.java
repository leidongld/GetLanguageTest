package com.example.leidong.getlanguagetest;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    //getCountry（）
    private TextView textView1;
    //getLanguage()
    private TextView textView2;
    //getDisplayCountry()
    private TextView textView3;
    //getDisplayLanguage()
    private TextView textView4;
    //getDisplayName()
    private TextView textView5;
    //getDisplayScript()
    private TextView textView6;
    //getDisplayVariant()
    private TextView textView7;
    //getDisplayCountries()
    private TextView textView8;
    //getDisplayLangueges
    private TextView textView9;
    //Button
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件
        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                //获取当前系统的语言
                String languageInfo = Locale.getDefault().getLanguage().toString();
                //获取当前语言对应的国家
                textView1.setText(Locale.getDefault().getCountry());
                textView2.setText(Locale.getDefault().getLanguage());
                textView3.setText(Locale.getDefault().getDisplayCountry());
                textView4.setText(Locale.getDefault().getDisplayLanguage());
                textView5.setText(Locale.getDefault().getDisplayName());
                textView6.setText(Locale.getDefault().getISO3Country());
                textView7.setText(Locale.getDefault().getISO3Language());
                String[] strs1 = Locale.getISOCountries();
                StringBuilder sb1 = new StringBuilder();
                for(int i = 0; i < strs1.length; i++){
                    sb1.append(strs1[i] + "  ");
                }
                textView8.setText(sb1.toString());
                String[] strs2 = Locale.getISOLanguages();
                StringBuilder sb2 = new StringBuilder();
                for(int i = 0; i < strs2.length; i++){
                    sb2.append(strs2[i] + "  ");
                }
                textView9.setText(sb2.toString());
            }
        });
    }

    /**
     * 获取控件
     */
    private void initView() {
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        button = (Button) findViewById(R.id.button);
    }
}
