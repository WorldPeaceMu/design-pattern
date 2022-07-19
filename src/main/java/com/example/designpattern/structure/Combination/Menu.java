package com.example.designpattern.structure.Combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 15:33
 * @Description: 菜单类 属于根节点
 */
public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponentList);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() throws Exception {
        if (level == 1) {
            System.out.println(name);
        }else if(level == 2) {
            System.out.println("-->" + name);
        }else {
            throw new Exception("level参数异常");
        }
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
