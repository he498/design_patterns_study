package com.ming.pattern.bridge;

/**
 * @version v1.0
 * @ClassNmae: Windows
 * @Description:
 *      扩展抽象化角色
 * @Author: Ming on 2022/8/7
 */

public class Windows extends OpratingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
