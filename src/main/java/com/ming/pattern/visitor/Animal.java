package com.ming.pattern.visitor;

/**
 * @version v1.0
 * @ClassNmae: Animal
 * @Description:
 * @Author: Ming on 2022/8/11
 */

//抽象元素角色类
public interface Animal {
    //接受访问者访问的功能
    void accept(Person person);
}
