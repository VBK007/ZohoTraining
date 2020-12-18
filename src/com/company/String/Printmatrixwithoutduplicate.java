package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class Printmatrixwithoutduplicate {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        int[][] array=new int[arraysize][arraysize-1];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }

System.out.println("Before swapping");
        for (int i=0;i<arraysize;i++){
            System.out.println(Arrays.toString(array[i]));
        }


        System.out.println("After deleting duplicate");
       int row=arraysize;
       int col=arraysize-1;


       for (int i=0;i<row;i++){
           int flag=0;
           for (int j=0;j<i;j++){
               flag=1;
               for (int k=0;k<col;k++){

                   if (array[i][k] != array[j][k]) {
                       flag = 0;
                   }


               }

               if (flag==1){
                   break;
               }


           }

         if (flag==0){
             for (int j=0;j<col;j++){
                 System.out.print(array[i][j]+" ");

             }
         }
           System.out.println();



       }





    }
}
