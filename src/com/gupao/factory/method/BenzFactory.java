package com.gupao.factory.method;

import com.gupao.factory.Benz;
import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:生产者
 * @createtime: 2018/11/7 19:42
 */
public class BenzFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
