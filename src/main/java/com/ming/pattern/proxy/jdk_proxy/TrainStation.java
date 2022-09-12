package com.ming.pattern.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassNmae: TrainStation
 * @Description:
 *      火车站类
 * @Author: Ming on 2022/7/30
 */

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
