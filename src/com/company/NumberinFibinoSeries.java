package com.company;

import java.util.Scanner;

public class NumberinFibinoSeries {

    public static void main(String[] args) {

        System.out.println("Enter the araay size");
        Scanner scanner=new Scanner(System.in);
        int arraysize=scanner.nextInt();
        int[] array=new int[arraysize];
        System.out.println("Enter the array element one by one");
        for (int i=0;i<arraysize;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println();
        int[] frequency=new int[40];
        int n1=0,n2=1;
        frequency[0]=n1;
        frequency[1]=n2;
        for (int i=2;i<frequency.length;i++){
            int n3=n1+n2;
            frequency[i]=n3;
            n1=n2;
            n2=n3;

        }

        System.out.println("The fibino Series element are");
        for (int i=0;i<frequency.length;i++){
            System.out.print(" | "+frequency[i]+ " |");
        }

        System.out.println();
System.out.println("Your array elemnts are");
        for (int i=0;i<arraysize;i++){
           System.out.print(" | "+array[i]+ " | ");
        }


System.out.println();
        for (int i=0;i<arraysize;i++){
            for (int j=0;j<frequency.length;j++){
                if (array[i]==frequency[j]){
                    System.out.print(" | "+array[i]);
                    break;
                }
            }
        }




    }

}
