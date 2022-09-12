package com.ming.pattern.strategy;

/**
 * @version v1.0
 * @ClassNmae: StrategyA
 * @Description:
 *      具体策略类
 * @Author: Ming on 2022/8/8
 */

public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
