package com.example.designpattern.structure.Combination;

/**
 * @Author: wanglin
 * @Time: 2022/7/19 16:03
 * @Description:
 */
public class TestCombination {

    public static void main(String[] args) {
        MenuComponent menuComponent = new Menu("系统管理", 1);
        MenuComponent m1 = new Menu("菜单管理", 2);
        MenuComponent m2 = new Menu("权限管理", 2);
        MenuComponent m3 = new Menu("角色管理", 2);

        menuComponent.add(m1);
        menuComponent.add(m2);
        menuComponent.add(m3);
        // 菜单管理
        MenuComponent item11 = new MenuItem("页面访问", 3);
        MenuComponent item12 = new MenuItem("展开菜单", 3);
        MenuComponent item13 = new MenuItem("编辑菜单", 3);
        MenuComponent item14 = new MenuItem("删除菜单", 3);
        MenuComponent item15 = new MenuItem("新增菜单", 3);
        m1.add(item11);
        m1.add(item12);
        m1.add(item13);
        m1.add(item14);
        m1.add(item15);
        // 权限管理
        MenuComponent item21 = new MenuItem("页面访问", 3);
        MenuComponent item22 = new MenuItem("提交保存", 3);
        m2.add(item21);
        m2.add(item22);

        // 角色管理
        MenuComponent item31 = new MenuItem("页面访问", 3);
        MenuComponent item32 = new MenuItem("新增角色", 3);
        MenuComponent item33 = new MenuItem("修改角色", 3);
        m3.add(item31);
        m3.add(item32);
        m3.add(item33);

        try {
            menuComponent.print();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
