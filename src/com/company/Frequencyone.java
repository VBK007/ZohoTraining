package com.company;

import java.util.Scanner;

public class Frequencyone {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array elements one by one");
        int[] array=new int[6];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }


        System.out.println();


        int visited=-1;
        int[] frequency=new int[array.length];

        for (int i=0;i<array.length;i++){
            int count=1;
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    count++;
                    frequency[j]=visited;
                }
            }

            if (frequency[i]!=visited){
                frequency[i]=count;
            }


        }


        System.out.println("Array Elements" + "  Frequency Elements");
        for (int i=0;i<frequency.length;i++){
            if (frequency[i]!=visited){
                System.out.println(" "+array[i] +" "+ frequency[i]);
            }
        }




    }



}
