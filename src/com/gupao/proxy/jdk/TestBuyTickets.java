package com.gupao.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author rico
 * @version 1.0
 * @description: jdk动态代理 案例-黄牛买票
 *      1.执行者、被代理人
 *      2.被代理人必须做，但没有时间或不想做，找代理
 *      3.获取被代理人的个人资料
 * @createtime: 2018/11/6 18:43
 */
public class TestBuyTickets {
    public static void main(String[] args) {
//        new ZHangsan().buyTickets();
        try {
            Person person = (Person) new Huangniu().getInstance(new ZHangsan());
            person.buyTickets();

            //获取字节码文件
//            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream out = new FileOutputStream("/Users/rico/IdeaProjects/Spring-Design-Patterns/$Proxy.class");
//            out.write(data);
//            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
