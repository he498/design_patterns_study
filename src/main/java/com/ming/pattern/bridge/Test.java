package com.ming.pattern.bridge;

/**
 * @version v1.0
 * @ClassNmae: Test
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class Test {
    public static void main(String[] args) {
        //创建Mac系统
        OpratingSystem system = new Mac(new AviFile());
        //使用操作系统播放视频文件
        system.play("战狼");
    }
}
