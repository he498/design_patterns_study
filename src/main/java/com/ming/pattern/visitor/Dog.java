package com.ming.pattern.visitor;

/**
 * @version v1.0
 * @ClassNmae: Dog
 * @Description:
 * @Author: Ming on 2022/8/11
 */
//具体元素角色类
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪汪汪");
    }
}
