package com.gupao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author rico
 * @version 1.0
 * @description:执行者
 * @createtime: 2018/11/6 18:44
 */
public class Huangniu implements InvocationHandler {

    private Person target;//将被代理对象的引用作为一个成员变量保存

    //获取被代理人的个人资料
    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你的名字是："+this.target.getName() + " 你住在：" + this.target.getAdd() + " 你要去："  + this.target.getDes());
        System.out.println("\n开始买票.........");
//        this.target.buyTickets();
        method.invoke(this.target,args);
        System.out.println("\n买好了，准备回家！");

        return null;
    }
}
