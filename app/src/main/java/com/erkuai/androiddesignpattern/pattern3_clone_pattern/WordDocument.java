package com.erkuai.androiddesignpattern.pattern3_clone_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/10/25.
 * <p>
 * ConcretePrototype。
 * Cloneable是Prototype。
 */

public class WordDocument implements Cloneable {
    //文本
    private String text;
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        Log.i(MainActivity.TAG + "-3", "--WordDocument构造函数--");
    }

    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        WordDocument document = (WordDocument) super.clone();
        document.text = this.text;
        document.mImages = this.mImages;
        return document;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    public void showDocument() {
        Log.i(MainActivity.TAG + "-3", "--------- Word Content Start ---------");
        Log.i(MainActivity.TAG + "-3", "text:" + text);
        Log.i(MainActivity.TAG + "-3", "image list:");
        for (String imgName :
                mImages) {
            Log.i(MainActivity.TAG + "-3", "image name:" + imgName);
        }

        Log.i(MainActivity.TAG + "-3", "--------- Word Content End ---------");
    }
}
