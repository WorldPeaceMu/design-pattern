package com.example.designpattern.structure.proxy.statics;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:11
 * @Description:
 */
public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取手续费");
        trainStation.sell();
    }
}
