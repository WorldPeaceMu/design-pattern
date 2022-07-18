package com.example.designpattern.structure.proxy.statics;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:11
 * @Description:
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
