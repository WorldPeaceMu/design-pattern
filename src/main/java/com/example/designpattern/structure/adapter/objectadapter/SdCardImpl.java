package com.example.designpattern.structure.adapter.objectadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:04
 * @Description: 目标接口实现类
 */
public class SdCardImpl {
    public String readSd() {
        return "SD card read: hello world!";
    }

    public void writeSd(String msg) {
        System.out.println("SD card write: " + msg);
    }
}
