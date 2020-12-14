package com.company;

import java.util.Scanner;

public class GivenSumisequaltok {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size0");
        int arraysize=scanner.nextInt();
        int[] atrray=new int[arraysize];
        System.out.println("Enter the array one by one");
        for (int i=0;i<arraysize;i++){
            atrray[i]=scanner.nextInt();
        }

        System.out.println("Enter the sum value");
        int k=scanner.nextInt();


        for (int i=0;i<atrray.length;i++){

            for (int j=i+1;j<atrray.length;j++){
                if (atrray[i]+atrray[j]==k){
                    System.out.print(" | "+atrray[i]+ " | "+atrray[j]);
                }
            }
        }



    }
}
