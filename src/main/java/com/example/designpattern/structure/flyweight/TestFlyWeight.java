package com.example.designpattern.structure.flyweight;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 20:52
 * @Description:
 */
public class TestFlyWeight {

    public static void main(String[] args) {

        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox x = boxFactory.getShape("I");
        x.display("蓝色");
        AbstractBox y = boxFactory.getShape("O");
        y.display("白色");
        AbstractBox z = boxFactory.getShape("L");
        z.display("红色");
        AbstractBox m = boxFactory.getShape("L");
        m.display("黑色");

        System.out.println(z == m);

    }
}
