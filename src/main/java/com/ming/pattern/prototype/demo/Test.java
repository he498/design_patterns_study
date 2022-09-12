package com.ming.pattern.prototype.demo;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        //调用Realizetype类中的clone 方法进行对象的kelong;
        Realizetype clone = realizetype.clone();
        //判断是否为同一对象
        System.out.println(realizetype==clone);
    }
}
