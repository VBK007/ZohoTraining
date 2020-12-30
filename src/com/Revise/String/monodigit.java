package com.Revise.String;

import java.util.Scanner;

public class monodigit {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the String number");
        String number = scanner.nextLine();
        char[] fa=number.toCharArray();

        System.out.println("Enter the Second String");
        String secstring = scanner.next();
        char[] sec=secstring.toCharArray();
        int count = 0;
String str="";
String str2="";

for (int i=0;i<fa.length;i++){
    if (!str.contains(fa[i]+"")){
        str+=fa[i];
    }
}

        for (int i=0;i<sec.length;i++){
            if (!str2.contains(sec[i]+"")){
                str2+=sec[i];
            }
        }

System.out.println(str);
        System.out.println(str2);

       for (int i=0;i<str2.length();i++){
           for (int j=0;j<str.length();j++){
               if (str2.charAt(i)==str.charAt(j)){
                   count++;
               }
           }
       }





        System.out.println(count);


    }
}
