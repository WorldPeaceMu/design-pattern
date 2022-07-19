package com.example.designpattern.structure.flyweight;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 20:32
 * @Description: 具体享元角色
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I形状";
    }
}
