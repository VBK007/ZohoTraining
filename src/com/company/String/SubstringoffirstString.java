package com.company.String;

import java.util.Scanner;

public class SubstringoffirstString {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first string");
        String firststring=scanner.next();
        System.out.println("Enter the Second String");
        String secondstring=scanner.next();

        int  res=0;
        for (int i=0;i<secondstring.length();i++){
            for (int j=0;j<firststring.length();j++){
                if (secondstring.charAt(i)!=firststring.charAt(j)){
                    res=0;
                }
                else {
                    res=1;
                }
            }
        }


        if (res==1){
            System.out.println("TRUE");

        }
        else {
            System.out.println("FALSE");
        }


    }
}
