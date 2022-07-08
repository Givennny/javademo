package com.structer;

public class for02 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
                if (j==i)
                    System.out.println();
            }
        }
    }
}
