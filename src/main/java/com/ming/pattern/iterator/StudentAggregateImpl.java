package com.ming.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassNmae: StudentAggregateImpl
 * @Description:
 * @Author: Ming on 2022/8/11
 */

public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
