package com.ming.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Test {
    public static void main(String[] args) {
        //创建意大利风味工厂对象
        ItalyDessertFactory factory = new ItalyDessertFactory();
        //获取拿铁咖啡，提拉米苏
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
        System.out.println("=======================================");
        //美式工厂
        AmericanDessertFactory factory1 = new AmericanDessertFactory();
        Coffee coffee1 = factory1.createCoffee();
        Dessert dessert1 = factory1.createDessert();
        System.out.println(coffee.getName());
        dessert1.show();
    }
}
