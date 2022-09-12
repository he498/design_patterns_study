package com.ming.pattern.proxy.static_proxy;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/30
 */

public class Test {
    public static void main(String[] args) {
        //创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        //调用方法进行买票
        proxyPoint.sell();

    }
}
