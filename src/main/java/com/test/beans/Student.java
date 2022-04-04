package com.test.beans;

import lombok.Generated;
import lombok.ToString;

import java.util.List;

@ToString
public class Student {
    String name;
    int age;
    Card card;
    List list;

    public Student(String name, int age, Card card) {
        this.name = name;
        this.card = card;
        this.age = age;
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setList(List list) {
        this.list = list;
    }

    public List getList() {
        return list;
    }

    public Student() {
        System.out.println("我被构造了");
    }
    /*

    private void init() {
        System.out.println("我是初始化方法！");
    }

    private void destroy() {
        System.out.println("我是销毁方法！");
    }*/

    @Deprecated
    public void Test(){
        System.out.println("我过时了");
    }

    public void SayAop(String str) {
        System.out.printf(str);
        System.out.println();
    }

    /*@Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }*/
}
