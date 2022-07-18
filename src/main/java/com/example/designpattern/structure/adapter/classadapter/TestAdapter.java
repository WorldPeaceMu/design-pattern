package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:10
 * @Description:
 */
public class TestAdapter {

    public static void main(String[] args) {
        // 读取SD卡数据
        Computer computer = new Computer();
        System.out.println(computer.readSd(new SdCardImpl()));
        System.out.println("================================>");
        // 读取TF卡数据
        System.out.println(computer.readSd(new SdCardAdapterTfCard()));


    }

}
