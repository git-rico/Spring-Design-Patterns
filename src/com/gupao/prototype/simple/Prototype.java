package com.gupao.prototype.simple;

/**
 * @author rico
 * @version 1.0
 * @description:
 * @createtime: 2018/11/8 18:43
 */
public class Prototype implements Cloneable {

    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
