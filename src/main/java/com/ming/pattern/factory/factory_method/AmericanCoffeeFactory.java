package com.ming.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassNmae: AmericanFactory
 * @Description:
 *      美式咖啡工厂对象
 * @Author: Ming on 2022/7/28
 */

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}
