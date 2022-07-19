package com.example.designpattern.structure.Combination;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 15:28
 * @Description: 菜单组件 抽象根节点
 */
public abstract class MenuComponent {

    protected String name;

    protected int level;

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print() throws Exception;

}
