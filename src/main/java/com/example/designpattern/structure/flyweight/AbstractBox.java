package com.example.designpattern.structure.flyweight;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 20:30
 * @Description: 抽象享元角色
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状为：" + getShape() + " 颜色为：" + color);
    }

}
