package com.ming.pattern.state.before;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class Test {
    public static void main(String[] args) {
        //创建电梯对象
        Lift lift = new Lift();
        //设置当前电梯状态
        lift.setState(ILift.OPENING_STATE);
        //打开电梯
        lift.open();
        //关闭电梯
        lift.close();
        lift.run();
        lift.stop();
    }
}
