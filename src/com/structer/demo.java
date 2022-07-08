package com.structer;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //打印三角形
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数据 ：");

        int num= scanner.nextInt();
        for (int i = 1; i <=num; i++) {
            for(int j=num;j>=i;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            for(int j=1;j<i;j++)
                System.out.print("*");
            System.out.println();
        }

        scanner.close();
    }
}
