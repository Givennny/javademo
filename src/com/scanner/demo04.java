package com.scanner;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {

        //连续输入多个数字，求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束

        Scanner scanner=new Scanner(System.in);

        double sum=0;
        int num=0;

        System.out.println("请输入数据： ");
        while(scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            num++;
            sum=sum+x;
        }
        System.out.println(num+"个数的和是： "+sum);
        System.out.println(num+"个数的平均值是"+(sum/num));

        scanner.close();
    }

}
