package com.oop.demo04;
//学生 is 人
//子类继承父类，就会有父类全部方法和属性
public class Student extends Person{
//control+h
private String name="cjy";
    public void print(){
        System.out.println("Student");
    }

    public void test1(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void test2(){
        print();//Student
        this.print();//Student
        super.print();//Person
    }
    public Student(){
        //隐藏代码：super（）；调用了父类的无参构造
        System.out.println("Student无参执行了");
    }
}
