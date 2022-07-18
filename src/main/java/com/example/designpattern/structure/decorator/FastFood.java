package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 23:52
 * @Description: 抽象构件角色
 */
public abstract class FastFood {

    private float price;

    private String describe;

    public FastFood(float price, String describe) {
        this.price = price;
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public FastFood() {
    }

    public abstract float cost();
}
