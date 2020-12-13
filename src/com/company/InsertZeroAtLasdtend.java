package com.company;

import java.util.Scanner;

public class InsertZeroAtLasdtend {
static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Array Elements Size");
        int arraysize=scanner.nextInt();
        int[] array=new int[arraysize];
        System.out.println("Enter the Element one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Before Changing");
        for (int i=0;i<arraysize;i++){
            System.out.print(" | "+array[i]);

        }
        System.out.println();
        System.out.println("After Swapping");
        int index=0;
        for (int i=0;i<arraysize;i++){
            if (array[i]!=0){

array[index++]=array[i];

            }

        }


        for (int i=index;i<arraysize;i++){
            array[i]=0;
        }

        for (int i=0;i<arraysize;i++){
            System.out.print(" | "+array[i]);
        }






    }
}
