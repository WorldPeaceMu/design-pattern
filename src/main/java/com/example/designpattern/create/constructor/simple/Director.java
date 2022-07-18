package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:38
 * @Description: 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车
    public Bike ConstructingBike() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
