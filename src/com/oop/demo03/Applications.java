package com.oop.demo03;

public class Applications {
    public static void main(String[] args) {
        Student Xiaoming = new Student();
        Student Xh = new Student();

        Xiaoming.name = "小明";
        Xh.name = "小红";

        Xiaoming.age = 3;
        Xh.age = 3;

        System.out.println(Xiaoming.name);
        System.out.println(Xiaoming.age);
        System.out.println(Xh.name);
        System.out.println(Xh.age);
//使用new实例化了一个对象
Person person=new Person();
        System.out.println(person.name);//null
        Person person1=new Person("cjy");
        System.out.println(person1.name);

        Student1 s1=new Student1();

        s1.setName("cjy");
        System.out.println(s1.getName());

        //alt+insert自动生成一些方法
    }
}
