package com.ming.pattern.template;

/**
 * @version v1.0
 * @ClassNmae: AbstractClass
 * @Description:
 *      抽象类（定义模板方法和基本方法）
 * @Author: Ming on 2022/8/8
 */

public abstract class AbstractClass {

    //模板方法定义,算法过程
    public void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }
    //具体方法和抽象方法
    public void pourOil(){
        System.out.println("倒油");
    }
    //第二步，热油是一样的所以直接实现
    public void heatOil(){
        System.out.println("热油");
    }
    //第三步倒蔬菜是不一样的（下包菜和下菜心）
    public abstract void pourVegetable();
    //第四步：到调味料是不一样的
    public abstract void pourSauce();
    //第五步，翻炒是一样的。
    public void fry(){
        System.out.println("翻炒====");
    }

}
