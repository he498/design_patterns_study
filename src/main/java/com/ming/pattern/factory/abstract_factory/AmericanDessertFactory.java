package com.ming.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassNmae: AmericanDessertFactory
 * @Description:
 *      美式风味甜品工厂
 *          --生产美式咖啡和抹茶慕斯
 * @Author: Ming on 2022/7/28
 */

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMouses();
    }
}
