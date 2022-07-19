package com.example.designpattern.structure.Combination;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 15:38
 * @Description: 菜单项类 叶子节点
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        System.out.println("---->" + name);
    }
}
