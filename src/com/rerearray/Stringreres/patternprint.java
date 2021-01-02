package com.rerearray.Stringreres;

import java.util.Scanner;

public class patternprint {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        for (int i=0;i<string.length();i++){
            int k=string.length()-i-1;
            for (int j=0;j<string.length();j++){
                if (j==i||j==k){
                    System.out.print(string.charAt(j));
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println(" ");


        }


    }
}
