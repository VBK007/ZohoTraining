package Strings;

import java.util.Scanner;

public class SecondStringisSubString {

    public static void main(String[] args) {
        System.out.println("Enter the First String");
        Scanner scanner=new Scanner(System.in);
        String firststring=scanner.next();
        System.out.println("Enter the Second String");
        String secondstring=scanner.next();

     int res=0;

     for (int i=0;i<secondstring.length();i++){
         System.out.println(" "+secondstring.charAt(i));
         for (int j=0;j<firststring.length();j++){
             System.out.println(" | "+firststring.charAt(j));
             if (secondstring.charAt(i)==firststring.charAt(j)){
                 res=1;
             }
             else {
                 res=0;
             }
         }
     }


        if (res==1){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }


    }

}
