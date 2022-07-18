package com.example.designpattern.create.prototype.light;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:43
 * @Description:
 */
public class Citation implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学，在XXXX年度被评为三好学生给，特发此证！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
