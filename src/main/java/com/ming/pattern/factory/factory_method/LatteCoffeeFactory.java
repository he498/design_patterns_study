package com.ming.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassNmae: LatteCoffeeFactory
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }
}
