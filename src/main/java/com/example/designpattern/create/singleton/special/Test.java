package com.example.designpattern.create.singleton.special;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 21:21
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance1 = SingletonEnum.INSTANCE;

        System.out.println(instance == instance1);
    }
}
