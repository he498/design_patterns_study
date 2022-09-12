package com.ming.pattern.visitor;

/**
 * @version v1.0
 * @ClassNmae: Cat
 * @Description:
 * @Author: Ming on 2022/8/11
 */

//具体元素角色类
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this); //访问者给宠物猫喂食
        System.out.println("喵喵喵");
    }
}
