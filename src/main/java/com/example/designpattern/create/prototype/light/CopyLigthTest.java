package com.example.designpattern.create.prototype.light;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 21:46
 * @Description:
 */
public class CopyLigthTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("aaa");
        Citation citation1 = citation.clone();
        citation.show();
        citation1.show();

    }
}
