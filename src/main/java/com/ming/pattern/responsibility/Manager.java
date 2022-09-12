package com.ming.pattern.responsibility;

/**
 * @version v1.0
 * @ClassNmae: Manager
 * @Description:
 * @Author: Ming on 2022/8/10
 */
//具体处理类
public class Manager extends Handler{
    public Manager() {
        super(Handler.Num_ONE,Handler.Num_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("部门经理审批：同意");
    }
}
