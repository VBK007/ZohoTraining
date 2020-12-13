package com.company;

import java.util.Scanner;

public class ExpressionFactorialandExponentialform {

    public static void main(String[] args) {

        System.out.println("Enter the String");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int res=isInteger(input.charAt(0));

for (int i=1;i<input.length();i+=2){
    char opr = input.charAt(i), opd = input.charAt(i+1);
    if (isoperand(opd)){

        if (opr=='+'){
            res+=opd;
        }
        else if (opr=='-'){
            res-=opd;
        }
        else if (opr=='*'){
            res*=opd;
        }
        else if (opr=='/'){
            res*=opd;
        }
        else if (opr=='!'){
            res=finfactorial(res*(res-1));
        }

    }


}


System.out.println("The value is "+ res);


    }

    private static int finfactorial(int i) {

        return finfactorial(i);


    }

    private static boolean isoperand(char opd) {
        return (opd >='0' && opd<='9');
    }


    private static int isInteger(char res) {


        return (int)(res -'0');
    }







}
