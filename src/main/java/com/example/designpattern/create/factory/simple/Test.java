package com.example.designpattern.create.factory.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 21:48
 * @Description:
 */
public class Test {

    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();
        //Coffee coffee = coffeeStore.orderCoffee("american");
        //Coffee coffee = coffeeStore.orderCoffee("latte");
        Coffee coffee = coffeeStore.orderCoffee("111");

        System.out.println(coffee.getName());
    }
}
