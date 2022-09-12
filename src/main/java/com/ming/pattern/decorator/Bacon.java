package com.ming.pattern.decorator;

/**
 * @version v1.0
 * @ClassNmae: Bacon
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class Bacon extends Garnish{
    public Bacon(FastFood fastFood){
        super(2,"培根",fastFood);
    }


    public float cost() {
        return getPrice() + getFastFood().cost();//计算价格
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
