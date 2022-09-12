package com.ming.pattern.observer;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class Test {
    public static void main(String[] args) {
        //1、创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //2、订阅公众号
        subject.attach(new WeiXinUser("ming"));
        subject.attach(new WeiXinUser("tt"));
        subject.attach(new WeiXinUser("zz"));
        //3、公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("有新消息更新！");
    }
}
