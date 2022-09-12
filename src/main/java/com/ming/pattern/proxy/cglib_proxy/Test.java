package com.ming.pattern.proxy.cglib_proxy;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/2
 */

public class Test {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法
        proxyObject.sell();
    }
}
