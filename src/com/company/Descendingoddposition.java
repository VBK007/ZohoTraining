package com.company;

import java.util.Scanner;

public class Descendingoddposition {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraysize= scanner.nextInt();


        int[] array=new int[arraysize];

        System.out.println("Ente the array data one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println();

        System.out.println("Before swapping ");
        for (int i=0;i<arraysize;i++){
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


        System.out.println();
        System.out.println("After swapping");
        for (int i=0;i<arraysize;i++){
            System.out.print(" | "+array[i]);
        }

    }
}
