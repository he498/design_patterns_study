package com.ming.pattern.builder.demo1;

/**
 * @version v1.0
 * @ClassNmae: MobileBuilder
 * @Description:
 *      具体构建者，用来构建摩拜单车对象
 * @Author: Ming on 2022/7/29
 */

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
