package com.ming.pattern.bridge;

/**
 * @version v1.0
 * @ClassNmae: AviFile
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
