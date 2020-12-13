package com.company;

import java.util.Scanner;

public class DescendingoddpositionAscendingevenpoition {
static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        int arraysize=scanner.nextInt();
        System.out.println("Enter the array data one by one");
        int[] array=new int[arraysize];
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println();
        System.out.println("Before swapping");
for (int i=0;i<array.length;i++){
    System.out.print(" | "+array[i]);
}

for (int i=0;i<arraysize-1;i+=2){
    for (int j=i+2;j<arraysize;j+=2){
        if (array[i]<array[j]){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
}

        for (int i=1;i<arraysize-1;i+=2){
            for (int j=i+2;j<arraysize;j+=2){
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }


System.out.println();
    System.out.println("After Swapping");
        for (int i=0;i< array.length;i++){
            System.out.print(" | "+array[i] );
        }


    }

}
