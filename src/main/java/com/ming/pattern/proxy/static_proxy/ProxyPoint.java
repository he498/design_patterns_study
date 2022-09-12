package com.ming.pattern.proxy.static_proxy;

/**
 * @version v1.0
 * @ClassNmae: ProxyPoint
 * @Description:
 *      代售点类
 * @Author: Ming on 2022/7/30
 */

public class ProxyPoint implements SellTickets{
    //声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    public void sell(){
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }
}
