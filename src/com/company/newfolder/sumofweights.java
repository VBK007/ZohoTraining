package com.company.newfolder;

import java.util.Scanner;

public class sumofweights {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int[] array=new int[5];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

int[] weight=new int[5];
        for (int i=0;i<array.length;i++){
            findsquareroot(array[i],i,weight);
        }



        System.out.println("Array elements  for weight");
        for (int i=0;i<array.length;i++){
            System.out.print("< "+ array[i]+" "+ weight[i]+" > ");
        }



    }

    private static void findsquareroot(int i, int i1, int[] weight) {

        if (issquareroot(i)){
            weight[i1]=5;
        }
        else if (isMultipleof4and6(i)){
            weight[i1]=4;
        }
        else if (isifevennumber(i)){
            weight[i1]=3;
        }





    }

    private static boolean isifevennumber(int i) {

        if (i%2==0) {
            return true;
        }
        return false;

    }

    private static boolean isMultipleof4and6(int weight) {

        if (weight%4==0&&weight%6==0){
            return true;
        }
return false;
    }

    private static boolean issquareroot(int weight) {
        double number=Double.parseDouble(String.valueOf(weight));

for (int i=1;i*i<=number;i++){
    if (number%i==0 && number/i==i){
        return true;
    }
}

        return false;
    }
}
