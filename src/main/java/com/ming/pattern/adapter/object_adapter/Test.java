package com.ming.pattern.adapter.object_adapter;

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
        //使用该电脑读取TF卡中的数据
        //创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
