package com.ming.pattern.prototype.test1;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassNmae: Student
 * @Description:
 * @Author: Ming on 2022/7/29
 */

public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
