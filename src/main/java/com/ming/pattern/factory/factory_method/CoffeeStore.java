package com.ming.pattern.factory.factory_method;


/**
 * @version v1.0
 * @ClassNmae: CoffeeStore
 * @Description:
 * @Author: Ming on 2022/7/27
 */

public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee(){
        Coffee coffee = factory.creatCoffee();
        //加配料
        coffee.addMile();
        coffee.addsugar();
        return coffee;
    }
}
