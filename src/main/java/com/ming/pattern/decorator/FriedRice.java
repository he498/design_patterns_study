package com.ming.pattern.decorator;

/**
 * @version v1.0
 * @ClassNmae: FriedRice
 * @Description:
 *      具体构件角色
 * @Author: Ming on 2022/8/7
 */

public class FriedRice extends FastFood{

    public FriedRice(){
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
