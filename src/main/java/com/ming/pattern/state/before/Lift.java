package com.ming.pattern.state.before;

/**
 * @version v1.0
 * @ClassNmae: Lift
 * @Description:
 * @Author: Ming on 2022/8/10
 */

//电梯类
public class Lift implements ILift{
    //声明一个记录当前电梯的状体
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                //什么事都不做
                break;
            case CLOSING_STATE:
                //执行开启操作
                System.out.println("电梯打开了");
                //设置当前电梯状态为开启
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //什么也不做
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯关门了。。。");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行了。。。");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了。。。");
                this.setState(STOPPING_STATE);
                break;
        }
    }
}
