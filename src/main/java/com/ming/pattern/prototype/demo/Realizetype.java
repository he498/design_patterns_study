package com.ming.pattern.prototype.demo;

/**
 * @version v1.0
 * @ClassNmae: Realizetype
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Realizetype implements Cloneable{
    public Realizetype(){
        System.out.println("具体的原型对象创建完成！");
    }


    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return (Realizetype) super.clone();
    }
}
