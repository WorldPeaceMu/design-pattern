package com.example.designpattern.structure.adapter.classadapter;

/**
 * @Author: wanglin
 * @Date: 2022/7/18 22:00
 * @Description: 适配者类接口
 */
public interface TfCard {

    String readTf();

    void writeTf(String msg);
}
