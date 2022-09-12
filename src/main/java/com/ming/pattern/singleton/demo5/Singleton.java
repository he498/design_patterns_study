package com.ming.pattern.singleton.demo5;

/**
 * @version v1.0
 * @ClassNmae: Singleton
 * @Description:
 *      静态内部类
 * @Author: Ming on 2022/7/27
 */

public class Singleton {
    private Singleton(){}
    //定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
