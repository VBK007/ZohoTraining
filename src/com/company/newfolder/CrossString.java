package com.company.newfolder;

import java.util.Scanner;

public class CrossString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        for (int i=0;i<string.length();i++){
            int k=string.length()-1-i;
            for (int j=0;j<string.length();j++){
                if (i==j||j==k){
                    System.out.print(string.charAt(j));
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }
}
