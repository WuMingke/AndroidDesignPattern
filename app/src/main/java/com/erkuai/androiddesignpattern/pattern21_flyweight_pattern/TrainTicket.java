package com.erkuai.androiddesignpattern.pattern21_flyweight_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

import java.util.Random;

//火车票
public class TrainTicket implements Ticket {

    //始发地
    public String from;
    //目的地
    public String to;
    //铺位
    public String bunk;
    //价格
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        Log.i(MainActivity.TAG + "-21", "购买从" + from + "到" + to + "的" +
                bunk + "火车票，价格：" + price);
    }
}
