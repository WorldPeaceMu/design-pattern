package com.example.designpattern.structure.bridge;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 14:46
 * @Description: 具体的实现化角色
 */
public class AviVideo implements Video {
    @Override
    public void decode(String msg) {
        System.out.println("AVI 格式播放：" + msg);
    }
}
