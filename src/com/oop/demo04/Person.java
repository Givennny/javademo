package com.oop.demo04;

public class Person {
private  int money=10_0000_0000;
    public  void say(){
        System.out.println("说了一句话");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //私有的东西无法被继承
    protected String name="CJY";
    public void print(){
        System.out.println("Person");
    }
    public Person(){
        System.out.println("Person无参执行了");
    }
}
