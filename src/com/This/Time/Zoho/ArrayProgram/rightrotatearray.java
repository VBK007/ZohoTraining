package com.This.Time.Zoho.ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class rightrotatearray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println("Enter the array data to swift right");
        Scanner scanner=new Scanner(System.in);
        int data=scanner.nextInt();
        System.out.println("Your array Elements");
        System.out.println(Arrays.toString(array));
        for (int i=0;i<data;i++){
            int last=array[array.length-1];
            int j;
            for (j=array.length-1;j>0;j--){
                array[j]=array[j-1];
            }
            array[j]=last;


        }

        System.out.println("After Swapping");
        System.out.println(Arrays.toString(array));




    }
}
