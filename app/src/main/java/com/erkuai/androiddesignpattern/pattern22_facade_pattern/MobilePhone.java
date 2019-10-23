package com.erkuai.androiddesignpattern.pattern22_facade_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

public class MobilePhone {
    private Phone phone;

    private Camera camera;

    {
        phone = new PhoneImpl();
        camera = new XiaoMiCamera();
    }

    public void videoChat() {
        Log.i(MainActivity.TAG + "-22", "-->视频聊天接通中");
        camera.open();
        phone.call();
    }

    public void hangUp() {
        phone.hangUp();
    }

    public void takePhoto() {
        camera.open();
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }
}
