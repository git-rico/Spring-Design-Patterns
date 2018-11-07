package com.gupao.factory.abstrct;

import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:
 * @createtime: 2018/11/7 19:59
 */
public class DefaultFactory extends AbstratFactory{
    @Override
    Car getCar() {
        return new AudiFactory().getCar();
    }
}
