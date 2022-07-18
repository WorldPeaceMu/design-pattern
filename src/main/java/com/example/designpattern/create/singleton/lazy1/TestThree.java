package com.example.designpattern.create.singleton.lazy1;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:29
 * @Description:
 */
public class TestThree {

    public static void main(String[] args) {

        SingletonLazyOne instance = SingletonLazyOne.getInstance();
        SingletonLazyOne instance1 = SingletonLazyOne.getInstance();

        System.out.println(instance == instance1);
    }
}
