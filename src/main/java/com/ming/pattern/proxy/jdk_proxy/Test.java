package com.ming.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/1
 */

public class Test {
    public static void main(String[] args) {
        //获取代理对象
        //1、创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2、使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3、调用卖调用的方法
        proxyObject.sell();
    }
}
