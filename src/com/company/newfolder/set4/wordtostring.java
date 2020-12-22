package com.company.newfolder.set4;

import java.util.Scanner;

public class wordtostring {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        if (n<=0){
            System.out.println("please enter valid number");
        }
        else {
            wordtostring a=new wordtostring();
            a.pw((n / 1000000000), " Billion");
            a.pw((n / 10000000) % 100, " crore");
            a.pw(((n / 100000) % 100), " lakh");
            a.pw(((n / 1000) % 100), " thousand");
            a.pw(((n / 100) % 10), " hundred");
            a.pw((n % 100), " ");
        }
        

    }

    private void pw(int i, String million) {
        String[] ones={" "," one","two","three","four",
        "five","six","seven","eight","nine","ten","level",
                "twelve","thirteen","fourtieen","fifiteen","sizteen",
                "seventeen","eighteen","nineteen"
        };
        String[] twos={" "," "," Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        if (i<19){
            System.out.print(ones[i]);

        }
        else {
            System.out.print(twos[i/10]+" "+ones[i%10]);
        }
       if (i>0){
           System.out.print(million);
       }










    }
}
