package com.ming.pattern.mediator;

/**
 * @version v1.0
 * @ClassNmae: HouseOwner
 * @Description:
 * @Author: Ming on 2022/8/10
 */

//具体同事角色类
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }
    //和中介联系
    public void constact(String message){
        mediator.constact(message,this);
    }
    //获取信息的方法
    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息时：" + message);
    }
}
