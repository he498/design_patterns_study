package com.ming.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassNmae: Builder
 * @Description:
 * @Author: Ming on 2022/7/29
 */

public abstract class Builder {
    //声明Bike类型的变量并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();
    //构建自行车的方法
    public abstract Bike creatBike();
}
