package com.example.designpattern.structure.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:04
 * @Description: cglib方式实现动态代理
 */
public class CglibProxyFactory implements MethodInterceptor {
    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于jdk代理中的proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();

        return trainStation;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // System.out.println("方法执行了！");
        System.out.println("代理点收取手续费！");
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}
