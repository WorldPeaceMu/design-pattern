package com.example.designpattern.create.prototype.deep;

import java.io.Serializable;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:45
 * @Description:
 */
public class Student implements Serializable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
