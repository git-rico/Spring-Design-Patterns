package com.gupao.proxy.cglib;

/**
 * @author rico
 * @version 1.0
 * @description:利用cglib实现动态代理
 * @createtime: 2018/11/7 17:32
 */
public class TestCglib {

    public static void main(String[] args) {

        try {
            Wangmazi  obj = (Wangmazi)new Meipo().getInstance(new Wangmazi());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
