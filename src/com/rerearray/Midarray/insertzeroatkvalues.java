package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;
import java.util.Scanner;

public class insertzeroatkvalues {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Enter the number of bits");
      int noofbits=scanner.nextInt();
        int[] rray=new int[20];
      System.out.println("Enter the array data one by one");
      for (int i=0;i<noofbits;i++){
          rray[i]=scanner.nextInt();
      }
      System.out.println("Enter the k values");
      int k=scanner.nextInt();

int count=0;
for (int i=0;i<rray.length;i++){
   if (rray[i]==1){
       count++;
   }
   else {
       count=0;
   }


   if (count==k){
       noofbits++;
       for (int j=rray.length-1;j>i;j--){
           rray[j]=rray[j-1];
       }
       rray[i+1]=0;
   }




}



for (int i=0;i<noofbits;i++){
    System.out.print(" "+rray[i]);
}

    }
}
