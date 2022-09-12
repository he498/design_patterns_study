package com.ming.pattern.mediator;/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 *
 * @Author: Ming on 2022/8/10
 */

public class Test {
    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        //创建租房者对象
        Tenant tenant = new Tenant("李四",mediator);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三",mediator);
        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constact("需要租三室的房子");
        houseOwner.constact("我这里由三室的房子，u need ?");
    }
}
