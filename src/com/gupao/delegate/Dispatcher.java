package com.gupao.delegate;

/**
 * @author rico
 * @version 1.0
 * @description:项目经理
 * @createtime: 2018/11/7 21:28
 */
public class Dispatcher implements IExcutor {

    IExcutor excutor;

    Dispatcher(IExcutor excutor){
        this.excutor=excutor;
    }

    @Override
    public void doingSth() {
        excutor.doingSth();
    }
}
