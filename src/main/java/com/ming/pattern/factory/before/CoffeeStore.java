package com.ming.pattern.factory.before;

/**
 * @version v1.0
 * @ClassNmae: CoffeeStore
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }

        //加配料
        coffee.addsugar();
        coffee.addMile();
        return coffee;
    }
}
