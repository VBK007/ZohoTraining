package com.This.Time.Zoho.ArrayProgram.String.Patterns;

import java.util.Scanner;

public class SuarePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
      int result= findSquare(n);


        printpatren(n,result);


    }

    private static void printpatren(int n, int result) {
        String str = "";
//        for (int i = 0; i < n; i++) {
//            int num = i;
//            int remaindercount = 0;
//            while (num > 0) {
//                int remainder = num % 2;
//                str = str + remainder;
//                remaindercount++;
//                num = num / 2;
//            }
//
//            while (remaindercount<n){
//                System.out.print(0);
//                remaindercount++;
//            }
//
//            System.out.print(str);
//            str="";
//            System.out.println();
//
//
//
//        }
        for (int i=0;i<result;i++){
            int num=i;
            int remaindercpount=0;
            while (num>0){
                int rem=num%2;
                str=rem+str;
                remaindercpount++;
                num=num/2;
            }

            while (remaindercpount<n){
                System.out.print(0);
                remaindercpount++;
            }

            System.out.print(str);

            str=" ";
            System.out.println();


        }
    }

    private static int findSquare(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = 2 * answer;
        }
        return answer;
    }


}
