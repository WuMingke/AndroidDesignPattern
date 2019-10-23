package com.erkuai.androiddesignpattern.pattern21_flyweight_pattern;

import android.util.Log;

import com.erkuai.androiddesignpattern.MainActivity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 返回车票数据的接口
 */
public class TicketFactory {

    //每次都产生一个对象
    /*public static Ticket getTicket(String from, String to) {
        return new TrainTicket(from, to);
    }*/

    //使用享元模式
    static Map<String, Ticket> map = new ConcurrentHashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (map.containsKey(key)) {
            Log.i(MainActivity.TAG + "-21", "使用缓存--》" + key);
            return map.get(key);
        } else {
            Log.i(MainActivity.TAG + "-21", "创建对象--》" + key);
            TrainTicket ticket = new TrainTicket(from, to);
            map.put(key, ticket);
            return ticket;
        }
    }
}
