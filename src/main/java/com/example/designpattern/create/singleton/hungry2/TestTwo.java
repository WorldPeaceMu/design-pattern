package com.example.designpattern.create.singleton.hungry2;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:22
 * @Description:
 */
public class TestTwo {

    public static void main(String[] args) {

        SingletonHungryTwo two = SingletonHungryTwo.getInstance();
        SingletonHungryTwo two1 = SingletonHungryTwo.getInstance();

        System.out.println(two == two1);
    }
}
