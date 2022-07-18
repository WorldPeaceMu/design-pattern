package com.example.designpattern.create.singleton.lazy1;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:29
 * @Description: 懒汉式1--多线程有问题
 */
public class SingletonLazyOne {

    private static SingletonLazyOne instance;

    private SingletonLazyOne() {

    }

    public static SingletonLazyOne getInstance() {
        if (instance == null) {
            instance = new SingletonLazyOne();
        }
        return instance;
    }
}
