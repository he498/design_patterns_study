package com.ming.pattern.facade;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class Test {
    public static void main(String[] args) {
        //创建智能音箱
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //控制家电
        facade.say("打开家电");
        System.out.println("===============");
        facade.say("关闭家电");
    }

}
