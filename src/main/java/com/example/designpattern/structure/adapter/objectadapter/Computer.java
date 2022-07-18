package com.example.designpattern.structure.adapter.objectadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:07
 * @Description: 计算机类
 */
public class Computer {

    public String readSd(SdCardImpl sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SdCard 不能为空！");
        }
        return sdCard.readSd();
    }

}
