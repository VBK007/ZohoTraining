package com.company.String;

import java.util.Scanner;

public class Addingdigitwithallnumber {
    public static void main(String[] args) {
        String str="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Digit ");
        int digit=scanner.nextInt();
        System.out.println("Enter the add number");
        int number=scanner.nextInt();

        while (number>0){
            int  rem=number%10;
            rem=rem+digit;
            str=rem+str;
            number=number/10;
        }

        System.out.println(str);
    }
}
