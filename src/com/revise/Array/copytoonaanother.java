package com.revise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class copytoonaanother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        int arrasize=scanner.nextInt();
        int[] array=new int[arrasize];
        for (int i=0;i<arrasize;i++){
            array[i]=scanner.nextInt();
        }

        int[] temp=new int[arrasize];
        for (int i=0;i<arrasize;i++){
            temp[i]=array[i];
        }


        System.out.println("Original Data");
        System.out.println(Arrays.toString(array));

        System.out.println("Temp Data");
        System.out.println(Arrays.toString(temp));


    }
}
