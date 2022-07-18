package com.example.designpattern.create.singleton.lazy3;

/**
 * @Author: wanglin
 * @Date: 2022/7/14 20:42
 * @Description: 懒汉式3--双重检查锁--推荐使用
 */
public class SingletonLazyThree {
    // 必须加volatile 否则可能出现空指针异常
    private static volatile SingletonLazyThree instance;

    private SingletonLazyThree() {

    }

    public static SingletonLazyThree getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyThree.class) {
                if(instance == null) {
                    // TODO A持有锁之后，执行到这里被挂起，B开始执行。B完成后，A被唤醒，是从这里继续执行吗？
                    instance = new SingletonLazyThree();
                }
            }
        }
        return instance;

    }

}
