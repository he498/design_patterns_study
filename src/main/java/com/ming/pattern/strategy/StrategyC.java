package com.ming.pattern.strategy;

/**
 * @version v1.0
 * @ClassNmae: StrategyC
 * @Description:
 * @Author: Ming on 2022/8/8
 */

public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满一千元加一元换购任意200元以下商品");
    }
}
