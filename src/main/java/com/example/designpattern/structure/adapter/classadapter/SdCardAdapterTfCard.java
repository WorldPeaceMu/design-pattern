package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:12
 * @Description:
 */
public class SdCardAdapterTfCard extends TfCardImpl implements SdCard {

    @Override
    public String readSd() {
        System.out.println("适配器read方法");
        return this.readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("适配器write方法");
        this.writeTf(msg);
    }
}
