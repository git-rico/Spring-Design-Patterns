package com.gupao.prototype.simple;

/**
 * @author rico
 * @version 1.0
 * @description:
 * @createtime: 2018/11/8 18:47
 */
public class CloneTest {

    public static void main(String[] args) {
        //这是原型
        Prototype cp = new Prototype();
        cp.setAge(18);


        try {
            Prototype copy = (Prototype) cp.clone();
            System.out.println(copy.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
