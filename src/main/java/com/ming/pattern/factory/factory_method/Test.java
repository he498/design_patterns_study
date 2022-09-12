package com.ming.pattern.factory.factory_method;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Test {
    public static void main(String[] args) {
        //创建咖啡店
        CoffeeStore store = new CoffeeStore();
        //创建工厂对象
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }


}
