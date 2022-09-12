package com.ming.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassNmae: Waitor
 * @Description:
 *      调用者角色
 * @Author: Ming on 2022/8/9
 */

public class Waitor {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();
    public void setCommands(Command cmd){
        //将cmd对象存储到List中
        commands.add(cmd);
    }
    //发起命令功能
    public void orderUp(){
        System.out.println("新订单==========");
        //遍历list集合
        for (Command command : commands) {
            if (command != null){
                command.execute();
            }
        }
    }
}
