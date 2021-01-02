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
    public static String string;
    public int arraysize;

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


    public static void getvo(){
        System.out.println("Enter the String");
        scanner=new Scanner(System.in);
        string=scanner.nextLine();
        firstchar=string.toCharArray();

        System.out.println(Arrays.toString(firstchar));
        String j="";
        int count=0;
        for (int i=0;i< firstchar.length;i++){
            if (isvoweel(firstchar[i])){
                j+=firstchar[i];
                count++;
            }

        }


        for (int i=0;i<firstchar.length;i++){
            if (isvoweel(firstchar[i])){
                firstchar[i]=j.charAt(--count);
            }
        }





        System.out.println(Arrays.toString(firstchar));


    }

    private static boolean isvoweel(char c) {
        return c=='a' || c=='e'|| c=='i' || c=='o'||c=='u' ;
    }

    public static void getdata2() {
        System.out.println("Enter the first array size");
        scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        firstarray=new int[20];

        System.out.println("Enter the array data one by one");
        for (int i=0;i<arraysize;i++){
            firstarray[i]=scanner.nextInt();



        }

        System.out.println("The Original array is");
        System.out.println(Arrays.toString(firstarray));
    }
}
