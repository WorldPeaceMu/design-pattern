package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 0:04
 * @Description:
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public String getDescribe() {
        return super.getDescribe() + " " + getFastFood().getDescribe();
    }

    @Override
    public float cost() {
        return getPrice() + super.getFastFood().getPrice();
    }
}
