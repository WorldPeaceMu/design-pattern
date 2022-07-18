package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 0:08
 * @Description:
 */
public class TestDecorator {

    public static void main(String[] args) {

        // 点一份炒饭
        FastFood fastFood = new FriedRice();
        System.out.println(fastFood.getDescribe());
        System.out.println(fastFood.getPrice());
        System.out.println("--------------------------------------->");
        // 加鸡蛋
        FastFood egg = new Egg(new FriedRice());
        System.out.println(egg.getDescribe());
        System.out.println("单价" + egg.getPrice());
        System.out.println("总价" + egg.cost());
        System.out.println("--------------------------------------->");
        // 再加一个鸡蛋
        FastFood egg2 = new Egg(egg);
        System.out.println(egg2.getDescribe());
        System.out.println("单价" + egg2.getPrice());
        System.out.println("总价" + egg2.cost());
        System.out.println("--------------------------------------->");
    }
}
