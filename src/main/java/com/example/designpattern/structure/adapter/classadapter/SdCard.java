package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:03
 * @Description: 目标接口
 */
public interface SdCard {

    String readSd();

    void writeSd(String msg);

}
