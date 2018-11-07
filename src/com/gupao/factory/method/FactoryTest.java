package com.gupao.factory.method;

/**
 * @author rico
 * @version 1.0
 * @description:消费者
 * @createtime: 2018/11/7 19:43
 */
public class FactoryTest {

    //工厂方法模式
    //各个产品的生产商，拥有各自的工厂
    //用户只关心产品的生产商
    public static void main(String[] args) {
        Factory factory = new BenzFactory();
        System.out.println(factory.getCar().getName());
    }

}
