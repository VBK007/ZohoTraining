package com.rerearray.Stringreres;

import java.util.Scanner;

public class apaper {
    public static void main(String[] args) {
        System.out.println("Enter the paperr no");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int count=0;
        for (int i=0;i<=number;i++){

            if (i>=10 &&i<=100){
                count+=2;
            }
           else if (i>100){
                count+=3;
            }
            else {
                count++;
            }

        }

        System.out.println(count+" ");
    }
}
