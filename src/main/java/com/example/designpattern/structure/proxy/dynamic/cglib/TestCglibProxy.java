package com.example.designpattern.structure.proxy.dynamic.cglib;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:08
 * @Description:
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        CglibProxyFactory factory = new CglibProxyFactory();

        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();

    }
}
