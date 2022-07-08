package com.oop;

public class demo02 {
    public static void main(String[] args) {

        //引用传递
Person person=new Person();
        System.out.println(person.name);
        demo02.change(person);
        System.out.println(person.name);
    }


    public static void change(Person person){
        person.name="cjy";
        }
}
class Person{
    String name;
}
