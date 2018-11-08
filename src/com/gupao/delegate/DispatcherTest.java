package com.gupao.delegate;

/**
 * @author rico
 * @version 1.0
 * @description:开始分配任务
 * @createtime: 2018/11/7 21:30
 */
public class DispatcherTest {

    public static void main(String[] args) {
        //看上去好像是项目经理在干活，实际是员工在干
        Dispatcher dispatcher = new Dispatcher(new ExcutorA());
        dispatcher.doingSth();
    }

}
