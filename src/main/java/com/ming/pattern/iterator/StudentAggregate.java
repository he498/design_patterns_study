package com.ming.pattern.iterator;

//抽象聚合角色类
public interface StudentAggregate {
    //添加学生功能
    void addStudent(Student stu);
    //删除学生功能
    void removeStudent(Student stu);
    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}
