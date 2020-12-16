package com.company.String;

import java.util.Scanner;

public class PrintPattern2 {
static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the pattern input");
        int input=scanner.nextInt();
        int base=1;
       for (int i=0;i<input;i++){
           base=base*2;

       }


       String str="";

       for (int i=0;i<base;i++){
           int count=0;
           int remaindercount=0;
           count=i;
           while (count>0){
               int rem=count%2;
               str=rem+str;
               remaindercount++;
               count=count/2;
           }

          while (remaindercount<input){
               System.out.print(0);
               remaindercount++;
           }

           System.out.print(str);
         str="";
System.out.println();
      }

       System.out.println();

    }

}
