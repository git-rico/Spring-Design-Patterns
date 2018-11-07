package com.gupao.factory.simple;

import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:消费者
 * @createtime: 2018/11/7 19:22
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Car car = new SimpleFactory().getCar("Benz");
        System.out.println(car.getName());

    }

}
