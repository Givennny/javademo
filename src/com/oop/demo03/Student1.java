package com.oop.demo03;

public class Student1 {
    //属性私有
    private String name;
    private int id;
    private char sex;


    //提供一些可以操作这个属性的方法
    //tigongyixiepublic的get，set方法

    public String   getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}
