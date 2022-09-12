package com.ming.pattern.factory.simple_factory;

/**
 * @version v1.0
 * @ClassNmae: CoffeeStore
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        //加配料
        coffee.addsugar();
        coffee.addMile();
        return coffee;
    }
}
