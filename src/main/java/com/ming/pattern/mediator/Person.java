package com.ming.pattern.mediator;

/**
 * @version v1.0
 * @ClassNmae: Person
 * @Description:
 * @Author: Ming on 2022/8/10
 */

//抽象同事类
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
