package com.base;

public class demo1 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;//强制转换
        //强制转换（类型）变量名    高--低
        //自动转换    低--高
        System.out.println(i);
        System.out.println(b);

        char d='a';
        int d1=d+1;
        System.out.println(d1);
        System.out.println((char)d1);

        int money=1000000000;
        int year=20;
        int total1=money*year;  //溢出
        long total2=money*year;  //计算结果时医默认溢出
        long total3=(long)money*year;
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
