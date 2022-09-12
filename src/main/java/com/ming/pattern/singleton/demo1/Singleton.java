package com.ming.pattern.singleton.demo1;

/**
 * @version v1.0
 * @ClassNmae: Singleton
 * @Description:
 *      饿汉式: 静态成员变量
 * @Author: Ming on 2022/7/26
 */

public class Singleton {
    //1.私有构造方法
    private Singleton(){
    }
    //2.在本类中创建本类对象
    private static Singleton instance = new Singleton();
    //3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
    /**
     * 1、将自身构造方法私有化
     * 2、在本类中创建本类对象并赋值(要给予static关键字将其变为静态变量，否则在getInstance方法中无法将自身返回)
     * 3、提供一个公共方法，让外界获取该对象
     */
}
