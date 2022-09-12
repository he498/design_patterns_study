package com.ming.pattern.factory.static_factory;

/**
 * @version v1.0
 * @ClassNmae: CoffeeStore
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type){

        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        //加配料
        coffee.addsugar();
        coffee.addMile();
        return coffee;
    }
}
