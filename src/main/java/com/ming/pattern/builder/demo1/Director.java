package com.ming.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassNmae: Director
 * @Description:
 *      指挥者类
 * @Author: Ming on 2022/7/29
 */

public class Director {
    //声明builder类型变量
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    //组装自行车功能
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.bike;
    }
}
