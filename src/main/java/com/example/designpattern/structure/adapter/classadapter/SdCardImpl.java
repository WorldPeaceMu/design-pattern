package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:04
 * @Description: 目标接口实现类
 */
public class SdCardImpl implements SdCard {
    @Override
    public String readSd() {
        return "SD card read: hello world!";
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("SD card write: " + msg);
    }
}
