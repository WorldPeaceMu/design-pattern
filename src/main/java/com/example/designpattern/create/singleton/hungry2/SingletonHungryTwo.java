package com.example.designpattern.create.singleton.hungry2;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:17
 * @Description: 饿汉式--静态代码块方式
 */
public class SingletonHungryTwo {

    private SingletonHungryTwo() {
    }

    private static SingletonHungryTwo instance;

    static {
        instance = new SingletonHungryTwo();
    }

    public static SingletonHungryTwo getInstance() {
        return instance;
    }
}
