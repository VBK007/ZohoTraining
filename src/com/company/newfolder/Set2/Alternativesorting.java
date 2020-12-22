package com.company.newfolder.Set2;

import java.util.Arrays;
import java.util.Scanner;

public class Alternativesorting {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        int[] array=new int[arraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }

        sortArray(array);

        System.out.println(Arrays.toString(array));
int length=arraysize/2;
        int s1=arraysize-1;
        for (int i=0;i<length;i++){
          if (arraysize%2==1){
              System.out.print(" "+array[s1]+" "+array[i]);
              s1--;
              if (i==(arraysize/2)-1){
                  System.out.print(" "+array[arraysize/2]);
              }
          }

          else{
 System.out.print(" "+array[s1]+" " +array[i]);

          }



        }


    }

    private static void sortArray(int[] array) {
        for (int i=0;i<array.length-1;i++){
            if (array[i]>array[i+1]){
                int temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
    }
}
