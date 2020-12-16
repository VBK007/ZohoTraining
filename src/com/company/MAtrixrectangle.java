package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MAtrixrectangle {

static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        int[][] array=new int[4][4];
        System.out.println("Enter the array data one by one");
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
               array[i][j]=scanner.nextInt();

            }
        }



        System.out.println();
        for (int i=0;i<array.length;i++){
     System.out.println(Arrays.toString(array[i]));
        }

        System.out.println();

        int count=printrectangle(array);

        System.out.println(count);


    }

    private static int printrectangle(int[][] array) {
       int row=array.length;
       int col=array.length;
if (row==0){
    return 0;
}

int count=0;
       for (int i=0;i<row;i++){
           for (int j=0;j<col;j++){
               if (array[i][j]==1){

                   for (int i1=i+1;i1<row;i1++){
                       for (int j1=j+1;j1<col;j1++){
                           if (array[i1][j]==1&&array[i][j1]==1&&array[i1][j1]==1){
                               count++;
                           }
                       }
                   }

               }


           }
       }



return count;
    }
}
