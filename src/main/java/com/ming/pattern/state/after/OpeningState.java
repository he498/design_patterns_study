package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: OpeningState
 * @Description:
 * @Author: Ming on 2022/8/10
 */
//开启状态类
public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启。。。");
    }

    @Override
    public void close() {
        //修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前状态中的context中的close方法
        super.context.close();
    }

    @Override
    public void run() {
        //do nothing
    }

    @Override
    public void stop() {
        //do nothing
    }
}
