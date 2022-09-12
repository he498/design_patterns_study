package com.ming.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassNmae: TFCardImpl
 * @Description:
 *      适配者类
 * @Author: Ming on 2022/8/3
 */

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msh : " + msg);
    }
}
