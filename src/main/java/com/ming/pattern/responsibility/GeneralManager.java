package com.ming.pattern.responsibility;

/**
 * @version v1.0
 * @ClassNmae: GeneralManager
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class GeneralManager extends Handler{
    public GeneralManager(){
        super(Handler.Num_THREE,Handler.Num_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("总经理审批：同意");
    }
}
