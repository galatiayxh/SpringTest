package com.test;

import com.test.beans.Card;
import com.test.beans.Student;
import com.test.beans.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Teacher teacher = context.getBean(Teacher.class);
        Student student = context.getBean(Student.class);
//        Card card = context.getBean(Card.class);
//        System.out.println(student);
//        List list = student.getList();
//        System.out.println(list.get(1) instanceof String);
        student.SayAop("学生在说话");
    }
}
