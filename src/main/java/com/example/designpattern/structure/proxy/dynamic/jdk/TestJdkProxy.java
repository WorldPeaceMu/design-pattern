package com.example.designpattern.structure.proxy.dynamic.jdk;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:03
 * @Description:
 */
public class TestJdkProxy {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets object = proxyFactory.getProxyObject();
        object.sell();
        System.out.println(object.getClass());
        while (true) {

        }
    }
}
