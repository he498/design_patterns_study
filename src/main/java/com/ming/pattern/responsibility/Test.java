package com.ming.pattern.responsibility;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class Test {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leaveRequest = new LeaveRequest("ming",4,"身体不适");
        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //设置处理者链
        manager.setNextHandler(generalManager);
        groupLeader.setNextHandler(manager);
        //提交申请
        groupLeader.submit(leaveRequest);
    }
}
