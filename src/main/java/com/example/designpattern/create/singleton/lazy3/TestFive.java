package com.example.designpattern.create.singleton.lazy3;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:42
 * @Description:
 */
public class TestFive {

    public static void main(String[] args) {

        SingletonLazyThree instance = SingletonLazyThree.getInstance();
        SingletonLazyThree instance1 = SingletonLazyThree.getInstance();

        System.out.println(instance == instance1);
    }
}
