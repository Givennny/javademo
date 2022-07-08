package com.oop.demo03;

public class Person {
    //一个类即使什么都不写，也会存在一个方法
    //形如public Person(){
//         }

    //显示构造器
    String name;
    //实例化初始值
    //构造器核心作用
    //1.使用new关键字，必须要有构造器
    //2.用来初始化值
    public  Person(){
        //无参构造就必须显式定义
    }

    //有参构造器：一旦定义了有参构造，无参构造就必须显式定义；
    public Person(String name){
        this.name=name;
    }





}

