package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: RunningState
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class RunningState extends LiftState{
    @Override
    public void open() {
        //do nothing
    }

    @Override
    public void close() {
        //do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
