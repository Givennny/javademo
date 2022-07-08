package com.array;


import java.util.Arrays;

public class demo03 {
    public static void main(String[] args) {
        int[] a={1,4,2,33,5,64,36,79};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));

    }
}
