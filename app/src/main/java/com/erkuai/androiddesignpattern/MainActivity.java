package com.erkuai.androiddesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.ProxySubject;
import com.erkuai.androiddesignpattern.pattern17_proxy_pattern.RealSubject;
import com.erkuai.androiddesignpattern.pattern18_composite_pattern.Composite;
import com.erkuai.androiddesignpattern.pattern18_composite_pattern.Leaf;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.Volt220;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.VoltAdapter;
import com.erkuai.androiddesignpattern.pattern19_adapter_pattern.VoltAdapter2;

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

        /*************************** 18.组合模式 ***************************/
        //构造一个根节点
        Composite root = new Composite("Root");
        //构造两个枝叶节点
        Composite branch1 = new Composite("branch1");
        Composite branch2 = new Composite("branch2");
        //构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf2 = new Leaf("Leaf2");
        //将叶子节点添加至枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);
        //将枝干节点添加至根节点中
        root.addChild(branch1);
        root.addChild(branch2);
        //执行方法
        root.doSomething();

        /*************************** 19.组合模式 ***************************/
        //类适配器模式
        VoltAdapter voltAdapter = new VoltAdapter();
        Log.i(TAG + "-19", "输出电压1：" + voltAdapter.getVolt5());
        //对象适配器模式
        VoltAdapter2 voltAdapter2 = new VoltAdapter2(new Volt220());
        Log.i(TAG + "-19", "输出电压2：" + voltAdapter2.getVolt220());

    }
}
