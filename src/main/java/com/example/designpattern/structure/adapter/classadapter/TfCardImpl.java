package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:01
 * @Description: 适配者接口实现
 */
public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        return "TF card read msg: hello world";
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("TF write：" + msg);
    }
}
