package com.ming.pattern.command;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/9
 */

public class Test {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("炒米粉",1);
        order1.setFood("柠乐",2);
        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("干炒牛河",2);
        order2.setFood("丝袜奶茶",1);
        //创建厨师对象
        SeniorChef receiver = new SeniorChef();
        //创建命令对象
        OrderCommand cmd1 = new OrderCommand(receiver,order1);
        OrderCommand cmd2 = new OrderCommand(receiver,order2);
        //创建调用者
        Waitor invoke = new Waitor();
        invoke.setCommands(cmd1);
        invoke.setCommands(cmd2);
        //发起命令
        invoke.orderUp();
    }
}
