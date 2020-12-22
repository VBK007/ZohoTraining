package com.company.newfolder.Set3;

import java.util.Scanner;

public class crossstring {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        for (int i=0;i<input.length();i++){
            int k=input.length()-1-i;
            for (int j=0;j<input.length();j++){
                if (i==j||j==k){
                    System.out.print(input.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
