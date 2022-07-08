package com.oop;

import com.oop.demo04.Student;
import com.oop.demo04.Teacher;
import com.oop.demo05.A;
import com.oop.demo05.B;
import com.oop.demo06.Person;
import com.oop.demo06.Student1;

public class Application {
    public static void main(String[] args) {
        //静态方法和非静态方法调用的结果区别很大！
        //对于静态方法：方法的调用只和左边的定义类型有关
        //只有非静态的方法才能选择重写
        A a=new A();
        a.test();
        //父类的引用指向了子类
        B b=new A();
        b.test();

        //一个对象的实际类型是确定的
        //new Student（）；
        //new person（）；

        //可以指向的引用类型就不确定了：父类的引用指向子类

        //Student 能调用的方法都是自己的或者继承父类的
        Student1 s1=new Student1();
        //person 父亲型，可以指向子类，但是不能调用子类独有的方法
        Person s2=new Person();
        Object s3=new Object();

        //对象能执行哪些方法，主要看对象左边的类型，和右边的关系不大！
        //s2.eat； 子类重写了父亲的方法，执行子类的方法
        s1.eat();

//Object>String
        //object>person>student
        //object>person>teacher

        Object object=new Student1();
        System.out.println(object instanceof Student1);//T
        System.out.println(object instanceof Person);//T
        System.out.println(object instanceof Object);//T
        System.out.println(object instanceof Teacher);//F
        System.out.println(object instanceof String);//F
        System.out.println("=======================");
        Person person=new Student1();
        System.out.println(person instanceof Student1);//T
        System.out.println(person instanceof Person);//T
        System.out.println(person instanceof Object);//T
       // System.out.println(person instanceof Teacher);编译报错
        //System.out.println(person instanceof String);
        System.out.println("=======================");
        Student1 S1=new Student1();
        System.out.println(S1 instanceof Student1);//T
        System.out.println(S1 instanceof Person);//T
        System.out.println(S1 instanceof Object);//T
       // System.out.println(S1 instanceof Teacher);
        //System.out.println(S1 instanceof String);

        Student student=new  Student();
        student.say();
        student.test1("given");
        student.test2();
    }

}
