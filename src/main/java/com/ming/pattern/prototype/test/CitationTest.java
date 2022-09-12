package com.ming.pattern.prototype.test;

/**
 * @version v1.0
 * @ClassNmae: CitationTest
 * @Description:
 * @Author: Ming on 2022/7/28
 */

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation = new Citation();
        //创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);
        //克隆奖状对象
        Citation citation1 = citation.clone();
        Student stu1 = citation1.getStudent();
        stu1.setName("李四");
        //stu1与stu是同一个对象导致，后面stu1.setName后，stu也修改了name属性,这就是浅克隆的弊端
//        citation.setName("张三");
//        citation1.setName("李四");
        citation.show();
        citation1.show();
    }
}
