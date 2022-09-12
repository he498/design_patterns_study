package com.ming.pattern.bridge;

/**
 * @version v1.0
 * @ClassNmae: OpratingSystem
 * @Description:
 *      抽象化角色
 * @Author: Ming on 2022/8/7
 */

public abstract class OpratingSystem {
    //声明videoFile
    protected VideoFile videoFile;
    public OpratingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
