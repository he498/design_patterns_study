package com.ming.pattern.bridge;

/**
 * @version v1.0
 * @ClassNmae: RmvbFile
 * @Description:
 * @Author: Ming on 2022/8/7
 */

public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件： " + fileName);
    }
}
