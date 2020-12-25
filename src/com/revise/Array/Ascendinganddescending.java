package com.revise.Array;

import java.util.Arrays;

public class Ascendinganddescending {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
        int[] array=file.array;
        System.out.println(Arrays.toString(array));
        for (int i=0;i<array.length;i++){

            for (int j=0;j<array.length;j++){
              if (array[i]>array[j]){
                  int temp=array[i];
                  array[i]=array[j];
                  array[j]=temp;
              }
            }
        }
        System.out.println("Descending order");
        System.out.println(Arrays.toString(array));


        for (int i=0;i<array.length;i++){

            for (int j=0;j<array.length;j++){
                if (array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
System.out.println("Ascending ordeer");
        System.out.println(Arrays.toString(array));





    }
}
