package com.ming.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassNmae: SDAdapterTD
 * @Description:
 * @Author: Ming on 2022/8/3
 */

public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
