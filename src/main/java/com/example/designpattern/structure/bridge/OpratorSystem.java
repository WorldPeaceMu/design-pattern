package com.example.designpattern.structure.bridge;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 14:49
 * @Description: 抽象化角色
 */
public abstract class OpratorSystem {

    protected Video video;

    public OpratorSystem(Video video) {
        this.video = video;
    }

    public abstract void play(String msg);
}
