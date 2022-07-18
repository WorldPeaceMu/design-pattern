package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:38
 * @Description:
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
