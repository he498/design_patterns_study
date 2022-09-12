package com.ming.pattern.singleton.demo2;

/**
 * @version v1.0
 * @ClassNmae: Singleton
 * @Description:
 *      饿汉式： 静态代码块
 * @Author: Ming on 2022/7/26
 */

public class Singleton {
    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量
    private static Singleton instance; //null

    //在静态代码快中进行赋值
    static{
        instance = new Singleton();
    }

    //对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }
    /**
     * 1、将构造方法私有
     * 2、声明自身类的类型变量 private static Singleton instance;
     * 3、在静态代码快中给自身类赋值
     * 4、对外提供获取自身类对象的方法：getInstance()
     */

}
