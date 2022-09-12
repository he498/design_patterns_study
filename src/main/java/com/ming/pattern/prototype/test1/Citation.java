package com.ming.pattern.prototype.test1;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassNmae: Citation
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class Citation implements Cloneable, Serializable {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show(){
        System.out.println(student.getName() + "同学被评为三好学生，特发此状");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
