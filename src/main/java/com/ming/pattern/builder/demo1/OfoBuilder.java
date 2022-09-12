package com.ming.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassNmae: OfoBuilder
 * @Description:
 *      Ofo具体构建者
 * @Author: Ming on 2022/7/29
 */

public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
