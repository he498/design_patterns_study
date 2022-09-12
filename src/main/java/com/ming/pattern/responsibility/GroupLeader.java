package com.ming.pattern.responsibility;

/**
 * @version v1.0
 * @ClassNmae: GroupLeader
 * @Description:
 * @Author: Ming on 2022/8/10
 */

//具体处理者
public class GroupLeader extends Handler {


    public GroupLeader() {
        super(0,Handler.Num_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("小组长审批：同意");
    }
}
