package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:39
 * @Description:
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
