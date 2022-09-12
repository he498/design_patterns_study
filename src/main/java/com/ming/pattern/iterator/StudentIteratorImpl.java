package com.ming.pattern.iterator;

import java.util.List;

/**
 * @version v1.0
 * @ClassNmae: StudentIteratorImpl
 * @Description:
 * @Author: Ming on 2022/8/11
 */

//具体迭代器角色类
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    private int position = 0; //用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student current = list.get(position);
        position ++;
        return current;
    }
}
