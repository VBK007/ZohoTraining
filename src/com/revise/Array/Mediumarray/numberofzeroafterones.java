package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

public class numberofzeroafterones {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata3();
        int[] array=file.array;
        System.out.println("Enter the consective k");
        int k=file.scanner.nextInt();

        System.out.println("Before changing");
        for (int i=0;i<file.n;i++){
            System.out.print( " | "+array[i]);
        }
        int n=file.n;
        int count=0;
       for (int i=0;i<n;i++){

           if (array[i]==1){
               count++;
           }
           else {
               count=0;
           }

           if(count==k){
             n++;

               for (int j=array.length-1;j>i;j--){
                   array[j]=array[j-1];
               }
               array[i+1]=0;
           }


       }
       System.out.println();

      System.out.println("After change");
       for (int i=0;i<n;i++){
           System.out.print( " | "+array[i]);
       }

    }
}
