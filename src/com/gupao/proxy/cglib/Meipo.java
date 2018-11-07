package com.gupao.proxy.cglib;

import com.gupao.proxy.jdk.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author rico
 * @version 1.0
 * @description:执行者
 * @createtime: 2018/11/7 17:53
 */
public class Meipo implements MethodInterceptor {

    //获取被代理人的个人资料
    public Object getInstance(Object obj) throws Exception{
        Enhancer enhancer = new Enhancer();
        //告诉cglib生成的子类需要继承哪个类
        enhancer.setSuperclass(obj.getClass());
        //设置回调 回调invoke方法
        enhancer.setCallback(this);
        //生成源代码
        //编译生成class文件
        //加载到jvm中执行，并返回被代理对象
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我是媒婆，要给你找对象,先拿到你的要求，然后去找");
        System.out.println("--------------");
        //这个obj引用是由cglib去new出来的
        //cglib new出来的对象，是被代理对象的子类
        //OOP 在new子类之前，实际先调用了super（）方法
        //new子类时，先new父类，相当于间接的持有了父类的引用
        //改变子类的属性时，可以间接操作父类
        proxy.invokeSuper(obj,args);
        System.out.println("--------------");
        return null;
    }

}
