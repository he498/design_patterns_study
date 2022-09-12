package com.ming.pattern.strategy;

/**
 * @version v1.0
 * @ClassNmae: StrategyB
 * @Description:
 * @Author: Ming on 2022/8/8
 */

public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满两百减五十");
    }
}
