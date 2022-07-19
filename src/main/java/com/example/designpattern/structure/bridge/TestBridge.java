package com.example.designpattern.structure.bridge;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 14:54
 * @Description:
 */
public class TestBridge {

    public static void main(String[] args) {
        OpratorSystem opratorSystem = new WindowsOS(new AviVideo());
        opratorSystem.play("钢铁侠");
    }

}
