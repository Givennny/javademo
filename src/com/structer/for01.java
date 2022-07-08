package com.structer;

public class for01 {
    public static void main(String[] args) {
        // 循环输出1-1000之间可以被5整除的数，每行输三个

        int i;
        for(i=1;i<=1000;i++){
            if(i%5==0)
                System.out.print(i+"\t");
            if(i%15==0)
                System.out.println();
            //System.out.print('\n');
        }
    }
}
