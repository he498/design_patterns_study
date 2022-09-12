package com.ming.pattern.flyweight;

/**
 * @version v1.0
 * @ClassNmae: IBox
 * @Description:
 *      具体享元角色
 * @Author: Ming on 2022/8/8
 */

public class IBox extends AbstractBox{
    @Override
    public String getShape() {
        return "I";
    }
}
