package com.example.designpattern.structure.facade;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 15:01
 * @Description:
 */
public class SmartFacade {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public SmartFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void controlSmart(String msg) {
        if (msg.contains("打开")) {
            turnOn();
        }else if (msg.contains("关闭")) {
            turnOff();
        }
    }

    private void turnOff() {
        light.off();
        tv.off();
        airCondition.off();
    }

    private void turnOn() {
        light.on();
        tv.on();
        airCondition.on();
    }
}
