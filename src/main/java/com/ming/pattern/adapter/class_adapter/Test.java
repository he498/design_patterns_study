package com.ming.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/3
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //读取SD卡数据
        String msg =  computer.readSD(new SDCardImpl());
        System.out.println(msg);
        System.out.println("==================");
        //使用电脑读取TF卡中的数据
        //需要定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
