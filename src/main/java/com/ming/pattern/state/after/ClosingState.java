package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: ClosingState
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class ClosingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();

    }
    @Override
    public void close() {
        System.out.println("电梯关门。。。");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
