package com.ming.pattern.prototype.test1;

import java.io.*;

/**
 * @version v1.0
 * @ClassNmae: CitaionTest
 * @Description:
 * @Author: Ming on 2022/7/29
 */

public class CitaionTest {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        //创建张三学生对象
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/Workspace/ideajwork/design_patterns/a.txt"));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/Workspace/ideajwork/design_patterns/a.txt"));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        ois.close();
        Student stu1 = citation1.getStudent();
        stu1.setName("李四");
        citation.show();
        citation1.show();

    }
}
