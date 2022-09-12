package com.ming.pattern.strategy;

/**
 * @version v1.0
 * @ClassNmae: SalesMan
 * @Description:
 *      环境类
 * @Author: Ming on 2022/8/8
 */

public class SalesMan {
    //聚合策略类对象
    private Strategy strategy;
    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }
    //由促销员展示促销活动
    public void salesManShow(){
        strategy.show();
    }
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
