package com.example.designpattern.create.singleton.lazy2;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:40
 * @Description:
 */
public class TestFour {

    public static void main(String[] args) {

        SingletonLazyTwo instance = SingletonLazyTwo.getInstance();
        SingletonLazyTwo instance1 = SingletonLazyTwo.getInstance();

        System.out.println(instance == instance1);
    }
}
