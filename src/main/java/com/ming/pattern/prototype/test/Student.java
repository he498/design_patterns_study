package com.ming.pattern.prototype.test;

/**
 * @version v1.0
 * @ClassNmae: Student
 * @Description:
 * @Author: Ming on 2022/7/29
 */

public class Student {
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
