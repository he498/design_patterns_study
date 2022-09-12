package com.ming.pattern.singleton.demo4;

/**
 * @version v1.0
 * @ClassNmae: Singleton
 * @Description:
 *      双重检查锁
 * @Author: Ming on 2022/7/26
 */

public class Singleton {
    private Singleton(){}
    private volatile static Singleton instance;

    public static Singleton getInstance(){
        //第一次判断,如果instance的值不为null 不需要抢占锁，直接返回对象
        if(instance == null){
            synchronized (Singleton.class){
                //第二次判断
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
