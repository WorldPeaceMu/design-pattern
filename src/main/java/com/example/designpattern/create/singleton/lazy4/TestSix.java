package com.example.designpattern.create.singleton.lazy4;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:52
 * @Description:
 */
public class TestSix {

    public static void main(String[] args) {
        SingletonLazyFour instance = SingletonLazyFour.GetInstance();
        SingletonLazyFour instance1 = SingletonLazyFour.GetInstance();

        System.out.println(instance == instance1);
    }
}
