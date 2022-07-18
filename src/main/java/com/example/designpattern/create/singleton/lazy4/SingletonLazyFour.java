package com.example.designpattern.create.singleton.lazy4;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:52
 * @Description: 懒汉式--静态内部类方式--推荐使用
 */
public class SingletonLazyFour {

    private SingletonLazyFour() {

    }

    private static class SingletonHolder {
        private static final SingletonLazyFour INSTANCE = new SingletonLazyFour();
    }

    public static SingletonLazyFour GetInstance() {
        return SingletonHolder.INSTANCE;
    }

}
