package com.ming.pattern.singleton.demo1;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/26
 */

public class Test {
    public static void main(String[] args) {
        //创建Singleton 对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //同一个对象
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1==instance2);

    }
}
