package com.revise.Array;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
        int[] array=file.array;

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        int largeest=array[array.length-2];
        for (int i=array.length-2;i>0;i--){

            for (int j=i-1;j>=0;j--){
                if (array[i]<array[j]){
                    largeest=array[j];
                }
            }

        }
      System.out.println(largeest);

    }
}
