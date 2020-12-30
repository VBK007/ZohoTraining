package com.rerearray;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfiles {

    public static Scanner scanner;
    static int[] array;
    public static int[] firstarray;
    public static int[] secoundarray;
    static char[] firstchar;
    static char[] secchar;
    public static void getdatachar(){
        System.out.println("Enter the first string size");
        scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        firstchar=new char[arraysize];

        System.out.println("Enter the Second Array size");
        arraysize=scanner.nextInt();
        secchar=new char[arraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i< firstchar.length;i++){
            firstchar[i]=scanner.next().charAt(0);
        }


        System.out.println("Enter the array data one by one");
        for (int i=0;i< secchar.length;i++){
            secchar[i]=scanner.next().charAt(0);
        }





    }



    public static void getdata(){
        System.out.println("Enter the first array size");
        scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        firstarray=new int[arraysize];
        System.out.println("Enter the secound array size");
        arraysize=scanner.nextInt();
        secoundarray=new int[arraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<firstarray.length;i++){
            firstarray[i]=scanner.nextInt();



        }


        System.out.println("Enter the array data one by one");
        for (int i=0;i< secoundarray.length;i++){
            secoundarray[i]=scanner.nextInt();



        }


        System.out.println(Arrays.toString(firstarray));
        System.out.println(Arrays.toString(secoundarray));

    }


    public static void getdata1() {
        System.out.println("Enter the first array size");
        scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        firstarray=new int[arraysize];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<firstarray.length;i++){
            firstarray[i]=scanner.nextInt();



        }

        System.out.println("The Original array is");
        System.out.println(Arrays.toString(firstarray));
    }
}
