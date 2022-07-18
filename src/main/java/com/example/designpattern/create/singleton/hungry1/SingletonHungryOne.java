package com.example.designpattern.create.singleton.hungry1;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:06
 * @Description: 单例模式--饿汉式--静态成员变量方式
 */
public class SingletonHungryOne {

    private SingletonHungryOne() {
    }

    private static SingletonHungryOne instance = new SingletonHungryOne();

    public static SingletonHungryOne getInstance() {
        return instance;
    }

}
