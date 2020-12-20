package com.company.String;

import java.util.Arrays;
import java.util.Scanner;

public class setofnumbersdisitexits {
    static int[] temparray;
    static int visited=-1;
    static   int[] array;
    static     Scanner scanner;
    public static void main(String[] args) {
        System.out.println("Enter the number one by one");
       array=new int[4];
     scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        temparray=new int[array.length];

       setofnumbersdisitexits est=new setofnumbersdisitexits();
       est.display();
        int count=0;

      for (int i=0;i<array.length;i++){
          if (temparray[i]!=visited){
            count=1;
            break;
          }

      }

      if (count==0){
          System.out.println("Yeah we finished");
          System.out.println(Arrays.toString(temparray));
      }else {
          System.out.println("You not got it dude");
          est.display();
      }



    }

    private void display() {
        for (int i=0;i<array.length;i++){
            if (temparray[i]!=visited){
                System.out.print(" "+array[i]);
            }
        }
        System.out.println();

        System.out.println("Enter the digit");
        int digit=scanner.nextInt();


        for (int i=0;i<array.length;i++){

            if (temparray[i]!=visited)
            {
                findocuurence(digit,array[i],i);
            }

        }
    }

    private static void findocuurence(int digit, int x,int index) {
        for (int i=0;i<=x;i++){
            if (i==digit||isDigitpresence(i,digit)){
               temparray[index]=-1;
            }
        }

    }

    private static boolean isDigitpresence(int arr, int digit) {
        while (arr>0){
            if (arr%10==digit)
                break;
            arr=arr/10;
        }

        return arr>0;
    }
}
