package com.ming.pattern.factory.before;

/**
 * @version v1.0
 * @ClassNmae: Coffee
 * @Description:
 *      咖啡类
 * @Author: Ming on 2022/7/27
 */

public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addsugar(){
        System.out.println("加糖");
    }
    //加奶
    public void addMile(){
        System.out.println("加奶");
    }

}
