package com.example.designpattern.structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: wanglin
 * @Date: 2022/7/15 22:01
 * @Description: 代理对象的工厂类   代理类也实现了接口
 */
public class ProxyFactory  {
    private TrainStation trainStation = new TrainStation();

    // 返回代理对象
    public SellTickets getProxyObject() {
        /*
              ClassLoader loader,  类加载器 可以通过目标对象获取类加载器
              Class<?>[] interfaces,    代理类实现的接口的字节码对象
              InvocationHandler h       代理对象的调用处理程序
         */
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    /*
                        Object proxy,   代理第项 和ProxyObject是同一个对象， 在invoke方法中根本不用
                        Method method,  对接口中的方法进行封装的method对象
                        Object[] args,  调用方法的实际参数
                        返回值：          就是方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了");
                        System.out.println("代售点收取服务费--jdk动态代理");
                        // 执行目标对象的方法
                        Object o = method.invoke(trainStation, args);

                        return o;
                    }
                }
        );

        return sellTickets;
    }
}
