package com.example.designpattern.create.constructor.extension;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:42
 * @Description:
 */
public class TestConstructorExtension {

    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿")
                .mainboard("aaa")
                .screen("三星")
                .build();

        System.out.println(phone.toString());
    }
}
