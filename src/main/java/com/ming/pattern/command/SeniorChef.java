package com.ming.pattern.command;

/**
 * @version v1.0
 * @ClassNmae: SeniorChef
 * @Description:
 *      接收者
 * @Author: Ming on 2022/8/9
 */

public class SeniorChef {
    public void makeFood(String name,int num){
        System.out.println(num + "份" + name);
    }
}
