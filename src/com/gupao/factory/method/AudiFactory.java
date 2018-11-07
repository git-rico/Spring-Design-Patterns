package com.gupao.factory.method;

import com.gupao.factory.Audi;
import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:生产者
 * @createtime: 2018/11/7 19:43
 */
public class AudiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
