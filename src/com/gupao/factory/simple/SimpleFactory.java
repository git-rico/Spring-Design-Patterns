package com.gupao.factory.simple;

import com.gupao.factory.Audi;
import com.gupao.factory.BMW;
import com.gupao.factory.Benz;
import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:生产者
 * @createtime: 2018/11/7 19:17
 */
public class SimpleFactory {

    //实现统一化管理
    public Car getCar(String name){
        if ("Benz".equals(name)){
            return new Benz();
        }else if ("BMW".equals(name)){
            return new BMW();
        }else if ("Audi".equals(name)){
            return new Audi();
        }else {
            return null;
        }
    }

}
