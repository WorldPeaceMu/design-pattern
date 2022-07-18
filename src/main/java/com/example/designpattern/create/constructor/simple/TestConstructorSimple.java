package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:40
 * @Description:
 */
public class TestConstructorSimple {

    public static void main(String[] args) {
        // 创建指挥者对象
        Director director = new Director(new MobikeBuilder());
        // 组装
        Bike bike = director.ConstructingBike();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
