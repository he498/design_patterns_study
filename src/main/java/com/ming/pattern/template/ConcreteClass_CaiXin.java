package com.ming.pattern.template;

/**
 * @version v1.0
 * @ClassNmae: ConcreteClass_CaiXin
 * @Description:
 * @Author: Ming on 2022/8/8
 */

public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
