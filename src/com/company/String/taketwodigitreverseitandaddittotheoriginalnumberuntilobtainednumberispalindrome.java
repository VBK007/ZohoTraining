package com.company.String;

import java.util.Scanner;

public class taketwodigitreverseitandaddittotheoriginalnumberuntilobtainednumberispalindrome {
  static   Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number");
    int input=scanner.nextInt();

   int reverse= reversenumber(input);

   System.out.println(reverse);

  }





    private static boolean isplaindrome(int reverse) {
        int temp=0;
        String str="";
        int rev=reverse;
        while (rev>0){
            temp=rev%10;
            str+=temp;
            rev/=10;


        }

       return reverse==Integer.parseInt(str);

    }


    private static int reversenumber(int input) {
        String str="";
        int value=0;
        int main=input;
        while (input>0){
          int remainder=input%10;
          str+=remainder;
          input=input/10;

        }
        value=Integer.parseInt(str);
value+=main;

if (isplaindrome(value)){
    return value;
}

     return reversenumber(value);

    }


}
