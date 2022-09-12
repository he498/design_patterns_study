package com.ming.pattern.observer;

/**
 * @version v1.0
 * @ClassNmae: WeiXinUser
 * @Description:
 * @Author: Ming on 2022/8/10
 */
//具体观察者角色类
public class WeiXinUser implements Observer{

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
