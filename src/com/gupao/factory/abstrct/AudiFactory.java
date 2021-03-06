package com.gupao.factory.abstrct;

import com.gupao.factory.Audi;
import com.gupao.factory.Car;
import com.gupao.factory.method.Factory;

/**
 * @author rico
 * @version 1.0
 * @description:生产者
 * @createtime: 2018/11/7 19:43
 */
public class AudiFactory extends AbstratFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
