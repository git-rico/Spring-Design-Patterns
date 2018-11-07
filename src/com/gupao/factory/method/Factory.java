package com.gupao.factory.method;

import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:工厂标准
 * @createtime: 2018/11/7 19:40
 */
public interface Factory {
    //制定标准
    //必须有轮子
    //必须符合上路要求
    //必须符合尾气排放标准
    Car getCar();

}
