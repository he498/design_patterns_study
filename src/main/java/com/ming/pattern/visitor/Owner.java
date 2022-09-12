package com.ming.pattern.visitor;

/**
 * @version v1.0
 * @ClassNmae: Owner
 * @Description:
 * @Author: Ming on 2022/8/11
 */

//具体访问者角色类
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主任喂食狗");
    }
}
