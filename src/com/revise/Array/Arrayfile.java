package com.revise.Array;

import java.util.Scanner;

public class Arrayfile {
    public static Scanner scanner=new Scanner(System.in);
public static  int[] array;
   public static int[] firstarray;
  public static int[] secoundarray;
  public static int n;
    public  static void getdata(){

        System.out.println("Enter the Array size");
        int arraysize=scanner.nextInt();
        array=new int[arraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }
    }

    public  static void getdata2(){

        System.out.println("Enter the Array size");
        int arraysize=scanner.nextInt();
      firstarray=new int[arraysize];
        System.out.println("Enter the Array size");
        int secondarraysize=scanner.nextInt();
        secoundarray=new int[secondarraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<arraysize;i++){
            firstarray[i]=scanner.nextInt();
        }

        System.out.println("Enter the array data one by one");
        for (int i=0;i<secondarraysize;i++){
            secoundarray[i]=scanner.nextInt();
        }


    }

    public static void getdata3()

{

    array=new int[20];

    System.out.println("Enter the no of bits");
  n=scanner.nextInt();
  System.out.println("Enter the data one by one");
    for (int i=0;i<n;i++){
        array[i]=scanner.nextInt();
    }




}






}
