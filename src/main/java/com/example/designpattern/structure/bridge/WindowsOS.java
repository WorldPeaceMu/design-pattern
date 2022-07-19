package com.example.designpattern.structure.bridge;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 14:53
 * @Description: 扩展抽象化角色
 */
public class WindowsOS extends OpratorSystem {

    public WindowsOS(Video video) {
        super(video);
    }

    @Override
    public void play(String msg) {
        this.video.decode(msg);
    }


}
