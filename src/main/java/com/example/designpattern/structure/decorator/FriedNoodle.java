package com.example.designpattern.structure.decorator;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 23:54
 * @Description:
 */
public class FriedNoodle extends FastFood {

    public FriedNoodle() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
