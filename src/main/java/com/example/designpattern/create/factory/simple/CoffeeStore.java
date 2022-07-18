package com.example.designpattern.create.factory.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 21:44
 * @Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }else {
            throw new RuntimeException("对不起，没有您选择的咖啡！");
        }
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
