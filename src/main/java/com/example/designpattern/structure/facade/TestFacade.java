package com.example.designpattern.structure.facade;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 15:05
 * @Description:
 */
public class TestFacade {

    public static void main(String[] args) {
        SmartFacade smartFacade = new SmartFacade();
        smartFacade.controlSmart("打开");
        System.out.println("---------------------------------->");
        smartFacade.controlSmart("关闭");

    }
}
