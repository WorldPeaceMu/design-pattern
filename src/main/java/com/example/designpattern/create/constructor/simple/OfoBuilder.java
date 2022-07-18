package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:39
 * @Description:
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
