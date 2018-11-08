package com.gupao.delegate;

/**
 * @author rico
 * @version 1.0
 * @description:A需要做的任务
 * @createtime: 2018/11/7 21:25
 */
public class ExcutorA implements IExcutor {
    @Override
    public void doingSth() {
        System.out.println("A do something");
    }
}
