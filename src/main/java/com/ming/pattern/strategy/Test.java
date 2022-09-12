package com.ming.pattern.strategy;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/8
 */

public class Test {
    public static void main(String[] args) {
        //春季，使用春季促销活动
        SalesMan man = new SalesMan(new StrategyA());
        //展示促销活动
        man.salesManShow();
        System.out.println("===================");
        //夏季特卖
        man.setStrategy(new StrategyB());
        man.salesManShow();
    }
}
