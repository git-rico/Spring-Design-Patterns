package com.gupao.factory.abstrct;

import com.gupao.factory.Audi;
import com.gupao.factory.BMW;
import com.gupao.factory.Benz;
import com.gupao.factory.Car;

/**
 * @author rico
 * @version 1.0
 * @description:
 * @createtime: 2018/11/7 19:55
 */
public abstract class AbstratFactory {

    abstract Car getCar();

    //动态配置
    protected Car getCar(String name){
        if ("Benz".equals(name)){
            return new BenzFactory().getCar();
        }else if ("BMW".equals(name)){
            return new BMWFactory().getCar();
        }else if ("Audi".equals(name)){
            return new AudiFactory().getCar();
        }else {
            return null;
        }
    }

}
