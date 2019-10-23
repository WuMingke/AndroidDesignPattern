package com.erkuai.androiddesignpattern.pattern18_composite_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/10/23.
 * <p>
 * 具体枝干节点
 */

public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Log.i(MainActivity.TAG + "-18", "具体枝干：" + name);
        if (null != components) {
            for (Component c :
                    components) {
                c.doSomething();
            }
        }
    }

    //添加子节点
    public void addChild(Component component) {
        components.add(component);
    }

    //移除子节点
    public void removeChild(Component component) {
        components.remove(component);
    }

    //获取子节点
    public Component getChild(int index) {
        return components.get(index);
    }
}
