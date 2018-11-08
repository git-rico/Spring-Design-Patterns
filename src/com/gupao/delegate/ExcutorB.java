package com.gupao.delegate;

/**
 * @author rico
 * @version 1.0
 * @description:B要做的任务
 * @createtime: 2018/11/7 21:26
 */
public class ExcutorB implements IExcutor {
    @Override
    public void doingSth() {
        System.out.println("B do something!");
    }
}
