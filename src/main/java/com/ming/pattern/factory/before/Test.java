package com.ming.pattern.factory.before;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class Test {
    public static void main(String[] args) {
        //创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        //点咖啡
        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
