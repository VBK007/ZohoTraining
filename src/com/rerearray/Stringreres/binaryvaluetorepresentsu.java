package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class binaryvaluetorepresentsu {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        printpatter(number);
    }

    private static void printpatter(int number) {
int[] array=new int[20];
        Arrays.fill(array, -1);
int k=0;
        while (number!=0){
            int tem=number,m=0,p=1;
            while (tem!=0){

                int rem=tem%10;
                tem=tem/10;
                if (rem!=0)
                    m+=p;

                p*=10;
            }

            array[k++]=m;
           number=number-m;

        }
        for (int i=array.length-1;i>=0;i--){
           if (array[i]!=-1){
               System.out.print(array[i]+" ");
           }
        }

    }
}
