package com.This.Time.Zoho.ArrayProgram.String;

public class SecoundStringisSubString {
    public static void main(String[] args) {
        String firstString="Man";
        String secondStgring="n*";
        boolean isfound=false;
        for (int i=0;i<secondStgring.length();i++){
            char c=secondStgring.charAt(i);
            for (int j=0;j<firstString.length();j++){
                char d=firstString.charAt(j);
               if (c==d){
                   isfound=true;
                   break;
               }
               else {
                   isfound=false;
               }

            }
        }


        if (isfound){
            System.out.println("TRUE");
        }
        else {
            System.out.println("False");
        }


    }
}
