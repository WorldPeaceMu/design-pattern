package com.example.designpattern.create.prototype.deep;

import java.io.Serializable;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:45
 * @Description:
 */
public class CitationDeep implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected CitationDeep clone() throws CloneNotSupportedException {
        return (CitationDeep) super.clone();
    }

    public void show() {
        System.out.println(student.getName() + "同学，在XXXX年度被评为三好学生给，特发此证！");
    }
}
