package com.gupao.factory.method;

import com.gupao.factory.BMW;
import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:生产者
 * @createtime: 2018/11/7 19:41
 */
public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
