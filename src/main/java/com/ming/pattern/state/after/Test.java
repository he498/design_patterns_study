package com.ming.pattern.state.after;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/10
 */

public class Test {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前状态
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
