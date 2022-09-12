package com.ming.pattern.responsibility;

/**
 * @version v1.0
 * @ClassNmae: LeaveRequest
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class LeaveRequest {
    //姓名
    private String name;
    //请假天数
    private int num;
    //请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
