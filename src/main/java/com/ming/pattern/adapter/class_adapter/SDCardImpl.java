package com.ming.pattern.adapter.class_adapter;

/**
 * @version v1.0
 * @ClassNmae: SDCardImpl
 * @Description:
 * @Author: Ming on 2022/8/3
 */

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
