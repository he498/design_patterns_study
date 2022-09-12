package com.ming.pattern.singleton.demo3;

/**
 * @version v1.0
 * @ClassNmae: Singleton
 * @Description:
 *      懒汉式
 * @Author: Ming on 2022/7/26
 */

public class Singleton {
    //私有构造方法
    private Singleton(){}

    //声明Singleton 类型的变量instance
    private static Singleton instance; //只是声明一个该类型的变量并没有进行赋值，懒汉式是在首次使用时才进行创建
    //对外提供访问方式

    public static Singleton getInstance(){
        //加判断进行创建
        if (instance == null){
            //如果在多线程下，线程一进入然后阻塞等待，线程2获得cpu执行权，也会进入到该判断里进行创建。这样导致多线程下不安全，所以要加上synchronized锁
            instance = new Singleton();
        }
        return instance;
    }
}
