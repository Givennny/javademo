package com.method;

public class demo {
    public static void main(String[] args) {
       //调用可变参数
        printmax(34,3,3,2,56,5,7);
        printmax(new double[]{1,2,3});
    }
    public static void printmax(double... numbers){
        if(numbers.length==0){
            System.out.println("No arguement passed");
            return;
        }
        double ressult=numbers[0];

        //排序
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>ressult){
                ressult=numbers[i];
            }
        }
        System.out.println("The max value is"+ressult);
    }
}
