package com.This.Time.Zoho.ArrayProgram.String.Patterns;

import java.awt.*;

public class Crossword {
    public static void main(String[] args) {
        String str="PROGRAM";

        for (int i=0;i<str.length();i++){
            int k=str.length()-1-i;
            for (int j=0;j<str.length();j++){
                if (i==j||j==k){
                    System.out.print(str.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
System.out.println();
        String input="PROGRAM";
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
