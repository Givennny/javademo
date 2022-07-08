package com.method;

public class demo02 {
    public static void main(String[] args) {
int x=max(1,2);
//double x=max(1.0,2.0);   方法的重载
        System.out.println(x);
    }
    public static double max(double a, double b){
        double result=0;
        if(a==b){
            System.out.println("ab相当");
            return 0;   //终止方法

        }

        if (a>b){
            result=a;
        }else
            result=b;
        return result;
    }
    public static int max(int a,int b){
int result=0;
if(a==b){
    System.out.println("ab相当");
    return 0;   //终止方法

}

if (a>b){
    result=a;
}else
    result=b;
return result;
    }

}
