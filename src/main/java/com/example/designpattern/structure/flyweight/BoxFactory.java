package com.example.designpattern.structure.flyweight;

import java.util.HashMap;

/**
 * @Author: wanglin
 * @Date: 2022/7/19 20:35
 * @Description: 工厂类，将该类设计为单例模式
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> hashMap;

    private BoxFactory() {
        hashMap = new HashMap<String, AbstractBox>();
        hashMap.put("I", new IBox());
        hashMap.put("L", new LBox());
        hashMap.put("O", new OBox());
    }

    private static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory getInstance() {
        return boxFactory;
    }

    public AbstractBox getShape(String name) {
        return hashMap.get(name);
    }
}
