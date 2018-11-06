package com.gupao.proxy;

/**
 * @author rico
 * @version 1.0
 * @description: 案例-黄牛买票
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
