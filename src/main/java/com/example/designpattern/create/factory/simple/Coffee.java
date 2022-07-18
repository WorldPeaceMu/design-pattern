package com.example.designpattern.create.factory.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 21:40
 * @Description:
 */
public abstract class Coffee {

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }

    public abstract String getName();

}
