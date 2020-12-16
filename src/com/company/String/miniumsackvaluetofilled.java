package com.company.String;

import java.util.Scanner;

public class miniumsackvaluetofilled {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array size");
        int arraysize=scanner.nextInt();
        int[] firstarray=new int[arraysize];
        int[] secondarray=new int[arraysize];

        System.out.println("Enter the Sack initial value:");



        for (int i=0;i<secondarray.length;i++){
          firstarray[i]=scanner.nextInt();
        }

        System.out.println("Enter the Weight value");
        for (int i=0;i<secondarray.length;i++){
            secondarray[i]=scanner.nextInt();
        }

        System.out.println();


        for (int i=0;i<arraysize;i++){
            for (int j=0;j<arraysize;j++){
                if (firstarray[i]+secondarray[j]<=40){
                    System.out.print("Elemnts "+firstarray[i]+" "+secondarray[j]+" | "+(j+1));
                }
            }
            System.out.println();
        }




    }
}
