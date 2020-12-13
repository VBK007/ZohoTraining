package com.company;

import java.util.Scanner;

public class InsertConsectiveOnesZeroAfterone {

    public static void main(String[] args) {
        System.out.println("Enter the Number of Bits");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[] array=new int[20];
        System.out.println("Enter the array element one by one");
        for (int i=0;i<number;i++){
            array[i]=scanner.nextInt();
        }


        System.out.println();
        System.out.println("Enter the consective k Elements ");
        int k=scanner.nextInt();
        int count=0;
        for (int i=0;i<number;i++){
            if (array[i]==1){
                count++;
            }
            else {
                count=0;
            }

            if (count==k){
                number++;
                for (int j=array.length-1;j>i;j--){
                    array[j]=array[j-1];
                }

                array[i+1]=0;
            }

        }




        System.out.println("After the adding Ones");
        for (int i=0;i<number;i++){
            System.out.print(" "+array[i]);
        }

    }
}
