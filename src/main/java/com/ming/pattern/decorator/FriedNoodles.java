package com.ming.pattern.decorator;

/**
 * @version v1.0
 * @ClassNmae: FriedNoodles
 * @Description:
 *      炒面
 * @Author: Ming on 2022/8/7
 */

public class FriedNoodles extends FastFood{
    public FriedNoodles(){
        super(12,"炒面");
    }


    @Override
    public float cost() {
        return getPrice();
    }
}
