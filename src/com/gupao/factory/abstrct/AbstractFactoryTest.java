package com.gupao.factory.abstrct;

/**
 * @author rico
 * @version 1.0
 * @description:
 * @createtime: 2018/11/7 20:01
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        DefaultFactory factory = new DefaultFactory();
        System.out.println(factory.getCar("Benz").getName());
    }

}
