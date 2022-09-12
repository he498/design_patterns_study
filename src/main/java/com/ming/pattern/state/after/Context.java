package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: Context
 * @Description:
 * @Author: Ming on 2022/8/10
 */

//环境角色类
public class Context {
    //定义对应状态对象的常量
    public final static OpeningState OPENING_STATE = new OpeningState();
    public final static ClosingState CLOSING_STATE = new ClosingState();
    public final static RunningState RUNNING_STATE = new RunningState();
    public final static StoppingState STOPPING_STATE = new StoppingState();
    //定义当前状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }
    //设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前状态对象中的Context
        this.liftState.setContext(this);
    }
    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void stop(){
        this.liftState.stop();
    }
    public void run(){
        this.liftState.run();
    }
}
