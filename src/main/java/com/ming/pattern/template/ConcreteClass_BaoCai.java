package com.ming.pattern.template;

/**
 * @version v1.0
 * @ClassNmae: ConcreteClass_BaoCai
 * @Description:
 *      炒包菜类
 * @Author: Ming on 2022/8/8
 */

public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
