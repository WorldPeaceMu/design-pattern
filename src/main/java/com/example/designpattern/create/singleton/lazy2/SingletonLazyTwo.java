package com.example.designpattern.create.singleton.lazy2;


/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:37
 * @Description: 懒汉式2--线程安全
 */
public class SingletonLazyTwo {

    private SingletonLazyTwo() {

    }

    private static SingletonLazyTwo instance;

    public static synchronized SingletonLazyTwo getInstance() {
        if (instance == null) {
            instance = new SingletonLazyTwo();
        }
        return instance;
    }
}
