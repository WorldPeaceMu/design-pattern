package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 23:56
 * @Description: 抽象装饰着
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String describe, FastFood fastFood) {
        super(price, describe);
        this.fastFood = fastFood;
    }
}
