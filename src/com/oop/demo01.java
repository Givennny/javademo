package com.oop;

public class demo01 {
    //值传递
    public static void main(String[] args) {
int a=1;
        System.out.println(a);
    demo01 demo= new demo01();
    demo.change(a);
        System.out.println(a);


    }
    //返回值是空
    public void change(int a){
        a=10;
    }
}
