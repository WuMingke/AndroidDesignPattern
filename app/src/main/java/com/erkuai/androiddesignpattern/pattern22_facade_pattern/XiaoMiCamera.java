package com.erkuai.androiddesignpattern.pattern22_facade_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

public class XiaoMiCamera implements Camera {
    @Override
    public void open() {
        Log.i(MainActivity.TAG + "-22", "打开相机");
    }

    @Override
    public void takePicture() {
        Log.i(MainActivity.TAG + "-22", "拍照");
    }

    @Override
    public void close() {
        Log.i(MainActivity.TAG + "-22", "关闭相机");
    }
}
