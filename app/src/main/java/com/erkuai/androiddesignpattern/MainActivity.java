package com.erkuai.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.ProxySubject;
import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.RealSubject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "PATTERN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*************************** 17.代理模式 ***************************/
        //构造一个真实主题对象
        RealSubject realSubject = new RealSubject();
        //通过真实主题对象构造一个代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理的相关方法
        proxySubject.visit();
    }
}
