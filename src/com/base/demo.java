package com.base;

public class demo {
    public static void main(String[] args) {
        //整数拓展
        int i1=10;//10
        int i2=010;//80
        int i3=0x10;//160x
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
float a=0.1f;   //0.1
double b=1.0/10;   //0.1
        System.out.println(a);
        System.out.println(b);
        System.out.println(a==b);

        float a1=11111111111111f;
        float b1=a1+1;
        System.out.println(a1==b1);
//浮点数不能进行精确的运算


        char c1='a';
        char c2='中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);   //强制转换
        System.out.println((int)c2);

    }
}
