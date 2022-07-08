package com.array;

import java.util.Arrays;

public class demo04 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        sort(a);
        System.out.println(Arrays.toString(a));
    }


    public static int[] sort(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            boolean flag=false;//设置标志，减少没必要的比较
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
flag=true;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if(flag==false)
                break;
        }
return array;
    }
}

