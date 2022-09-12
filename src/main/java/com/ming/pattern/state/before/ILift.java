package com.ming.pattern.state.before;

/**
 * @version v1.0
 * @ClassNmae: ILift
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public  interface ILift {
    //定义四个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;
    //设置电梯状态的功能
    void setState(int state);
    //具体电梯操作功能
    void open();
    void close();
    void run();
    void stop();
}
