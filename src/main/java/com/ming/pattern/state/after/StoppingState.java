package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: StoppingState
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class StoppingState extends LiftState{
    @Override
    public void open() {
        //状态修改
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
