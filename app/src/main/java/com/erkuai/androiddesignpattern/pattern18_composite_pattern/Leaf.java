package com.erkuai.androiddesignpattern.pattern18_composite_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * 具体叶子节点
 */

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.i(MainActivity.TAG + "-18", "具体叶子：" + name);
    }
}
