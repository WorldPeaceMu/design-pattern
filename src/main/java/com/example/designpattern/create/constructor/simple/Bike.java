package com.example.designpattern.create.constructor.simple;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:37
 * @Description:
 */
public class Bike {
    // 车架
    private String frame;
    // 车座
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
