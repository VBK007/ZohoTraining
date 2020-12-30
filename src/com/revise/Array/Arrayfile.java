package com.revise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfile {
    public static Scanner scanner=new Scanner(System.in);
public static  int[] array;
   public static int[] firstarray;
  public static int[] secoundarray;
  public static int n;
  public static char[] farray;
  public static char[] secarray;
  public static String[] father;
  public static String[] child;

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

//        System.out.println("Enter the Array size");
//        int arraysize=scanner.nextInt();
//      firstarray=new int[arraysize];
//        System.out.println("Enter the Array size");
//        int secondarraysize=scanner.nextInt();
//        secoundarray=new int[secondarraysize];
//
//        System.out.println("Enter the array data one by one");
//        for (int i=0;i<arraysize;i++){
//            firstarray[i]=scanner.nextInt();
//        }
//
//        System.out.println("Enter the array data one by one");
//        for (int i=0;i<secondarraysize;i++){
//            secoundarray[i]=scanner.nextInt();
//        }
firstarray=new int[]{9, 2, 8,1 ,3, 5, 6, 7, 3, 1, 1, 6};
secoundarray=new int[]{7, 8, 4, 6, 2, 1, 9 ,9 ,7
};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(firstarray));
        System.out.println(Arrays.toString(secoundarray));


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


public static void getdata4(){

        System.out.println("Enter the first array size");
        int array_size=scanner.nextInt();
      farray=new char[array_size];
        System.out.println("Enter the secound array size");
        array_size=scanner.nextInt();
        secarray=new char[array_size];
        System.out.println("Enter the array data one by one");
        for (int i=0;i< farray.length;i++){
            farray[i]=scanner.next().charAt(0);
        }

        System.out.println("Enter the sec array data");
        for (int i=0;i< secarray.length;i++){
            secarray[i]=scanner.next().charAt(0);
        }

//    farray=new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
//    secarray=new char[]{
//            'a', 'b', 'd', 'e', 'e', 'g', 'g', 'i', 'i'
//    };
System.out.println("Original array");
        System.out.println(Arrays.toString(farray));
        System.out.println(Arrays.toString(secarray));


}



public static void getdata5(){

}






}
