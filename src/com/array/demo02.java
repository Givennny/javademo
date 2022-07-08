package com.array;

public class demo02 {
    public static void main(String[] args) {
        int []arrays={1,2,3,4,5};

        for(int array:arrays){
            System.out.println(array);
        }
int[] reverse=reverse(arrays);

print(reverse);

    }
//打印数组元素
    public static void print(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]+" ");
        }
    }
    //反转数组
    public static int[] reverse(int[] arrays){
        int[] result=new int[arrays.length];

        for (int i = 0,j=result.length-1;i < arrays.length; i++,j--) {
result[j]=arrays[i];
        }
        return  result;
    }
}
