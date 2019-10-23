package com.erkuai.androiddesignpattern.pattern20_decorator_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

/**
 * 组件具体实现类
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        Log.i(MainActivity.TAG + "-20", "Concrete_Component");
    }
}
