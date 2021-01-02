package com.rerearray.Stringreres;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        System.out.println("Enter the first string");
        Scanner scanner=new Scanner(System.in);
        String firststring=scanner.next();
        System.out.println("Enter the Second String");
        String secoundstring=scanner.next();

        char[] ch=firststring.toCharArray();
        char[] ch2=secoundstring.toCharArray();
       int count=0;
        for (int i=0;i<ch2.length;i++){

            for (int j=0;j<ch.length;j++){
                if (ch2[i]==ch[j]){
                    count=1;
                    break;
                }
                else {
                    count=0;
                }
            }
        }


        if (count==1){
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }



    }
}
