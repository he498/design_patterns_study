package com.ming.pattern.decorator;

/**
 * @version v1.0
 * @ClassNmae: Egg
 * @Description:
 *      鸡蛋类（具体的装饰者角色）
 * @Author: Ming on 2022/8/7
 */

public class Egg extends Garnish{

    public Egg(FastFood fastFood){
        super(1,"鸡蛋",fastFood);
    }

    public float cost() {
        return getPrice() + getFastFood().cost();//计算价格
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
