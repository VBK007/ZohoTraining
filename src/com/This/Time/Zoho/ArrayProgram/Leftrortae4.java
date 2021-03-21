package com.This.Time.Zoho.ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Leftrortae4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter the array element");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the array size to shift");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int first=array[0];
            int j;
            for (j=0;j<array.length-1;j++){
                System.out.println("|| "+j);
                array[j]=array[j+1];
                System.out.println(" "+ j);
            }

            array[j]=first;


        }

        System.out.println("After Swift the array data");
        System.out.println(Arrays.toString(array));




    }
}
