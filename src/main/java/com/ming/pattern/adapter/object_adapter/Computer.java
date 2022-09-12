package com.ming.pattern.adapter.object_adapter;

/**
 * @version v1.0
 * @ClassNmae: Computer
 * @Description:
 *      计算机类
 * @Author: Ming on 2022/8/3
 */

public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }

}
