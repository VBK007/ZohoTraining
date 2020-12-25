package com.revise.Array;

import java.util.Arrays;

public class leftrotete {
    public static void main(String[] args) {

        Arrayfile arrayfile=new Arrayfile();
     arrayfile.getdata();
     int[] array=arrayfile.array;
     System.out.println(Arrays.toString(array));

     System.out.println("Enter the number of k to shift");
     int k=arrayfile.scanner.nextInt();


     for (int i=0;i<k;i++){
         int firstdata=array[0];
         int j;
         for (j=0;j<array.length-1;j++){

             array[j]=array[j+1];

         }

         array[j]=firstdata;


     }


     System.out.println(Arrays.toString(array));


    }
}
