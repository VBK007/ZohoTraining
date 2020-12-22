package com.company.String;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;



public class Printstringoddlenght {
    static String string="";
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String input");
        String str=scanner.nextLine();
        int lenght=str.length();
        int mid=str.length()/2;
        System.out.println(lenght);
int k=0;
char[] array=new char[50];
char a[]=new char[50];
        for (int i=mid;i<str.length();i++){
            array[k++]=a[i];
      }
      for (int i=0;i<lenght;i++){
   array[k++]=a[i];
      }



      for (int i=0;i<str.length();i++){

          for (int j=0;j<str.length();j++){
              if(j<lenght-1)
                  System.out.print(" ");
              if(j>=lenght-1)
                  {
                      int p=0;
                 for ( p=mid;p<str.length();){
                     string+=str.charAt(p);
                System.out.print(string);
                 }
                      p = p + 1;
              }
          }
          lenght--;
          System.out.println(" ");
          }
      }

    }

