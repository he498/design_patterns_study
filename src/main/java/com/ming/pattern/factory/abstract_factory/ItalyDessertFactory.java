package com.ming.pattern.factory.abstract_factory;

/**
 * @version v1.0
 * @ClassNmae: ItalyDessertFactory
 * @Description:
 *      意大利甜品工厂
 *          --生产拿铁咖啡和提拉米苏
 * @Author: Ming on 2022/7/28
 */

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
