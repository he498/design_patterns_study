package com.ming.pattern.factory.config_factory;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Test {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.creatCoffee("american");
        System.out.println(coffee.getName());
        System.out.println("======================================");
        Coffee coffee1 = CoffeeFactory.creatCoffee("latte");
        System.out.println(coffee1.getName());
    }
}
