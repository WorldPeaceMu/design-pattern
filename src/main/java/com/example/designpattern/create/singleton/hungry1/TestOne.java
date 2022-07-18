package com.example.designpattern.create.singleton.hungry1;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:15
 * @Description:
 */
public class TestOne {

    public static void main(String[] args) {

        SingletonHungryOne singletonHungryOne = SingletonHungryOne.getInstance();
        SingletonHungryOne singletonHungryOne1 = SingletonHungryOne.getInstance();

        System.out.println(singletonHungryOne == singletonHungryOne1);
    }
}
