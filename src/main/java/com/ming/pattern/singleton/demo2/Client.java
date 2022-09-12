package com.ming.pattern.singleton.demo2;

/**
 * @version v1.0
 * @ClassNmae: Client
 * @Description:
 * @Author: Ming on 2022/7/26
 */

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}
