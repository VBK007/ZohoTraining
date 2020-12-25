package com.revise.Array;

import java.util.Arrays;

public class rightrotate {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        int[] array=file.array;
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the k elements to roatate");
        int k=file.scanner.nextInt();

        for (int i=0;i<k;i++)
        {
          int last=array[array.length-1];
          int j;
          for (j=array.length-1;j>0;j--){
              array[j]=array[j-1];
          }
           array[j]=last;

        }



        System.out.println(Arrays.toString(array));
    }
}
