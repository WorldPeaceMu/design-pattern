package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 0:04
 * @Description:
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " " + getFastFood().getDescribe();
    }

    @Override
    public float cost() {
        return getPrice() + super.getFastFood().cost();
    }
}
