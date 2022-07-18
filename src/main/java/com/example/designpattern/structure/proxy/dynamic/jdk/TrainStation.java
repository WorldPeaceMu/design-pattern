package com.example.designpattern.structure.proxy.dynamic.jdk;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:00
 * @Description:
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
