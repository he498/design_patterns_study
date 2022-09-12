package com.ming.pattern.builder.demo2;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/7/29
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                                        .cpu("intel")
                                        .screen("samsung")
                                        .memory("金士顿")
                                        .mainboard("华硕")
                                        .build();
        System.out.println(computer);
    }
}
