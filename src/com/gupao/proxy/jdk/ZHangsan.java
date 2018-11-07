package com.gupao.proxy.jdk;

/**
 * @author rico
 * @version 1.0
 * @description:被代理人
 * @createtime: 2018/11/6 18:26
 */
public class ZHangsan implements Person {

    private String name = "张三";

    private String add = "南京";

    private String des = "北京";

    @Override
    public void buyTickets() {
        System.out.println("我叫"+name);
        System.out.println("我住在"+add);
        System.out.println("我要去"+des);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
