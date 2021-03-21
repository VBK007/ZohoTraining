package com.This.Time.Zoho.ArrayProgram.String.Matrix;

public class FactorialandExponentialForm {
    public static void main(String[] args) {
        String expo="1+2*3";
        String number=splitnumber(expo);
        String operator=splitnumberi(expo);
        int answer=number.charAt(0)-48;

        System.out.println(number+" ");
        System.out.println(operator+" ");
        for (int i=0;i<operator.length();i++){
          switch (operator.charAt(i)){
              case '+':
                  answer=answer+(number.charAt(i+1)-48);
                  break;
              case '-':
                  answer=answer-(number.charAt(i+1)-48);
                  break;
              case '*':
                  answer=answer*(number.charAt(i+1)-48);
                  break;
              case '/':
                  answer=answer/(number.charAt(i+1)-48);
                  break;
          }
        }


        System.out.println(answer);

    }

    private static String splitnumberi(String expo) {
        String opr="";
        for (int i=0;i<expo.length();i++){
            if (isDigiti(expo.charAt(i))){
                opr+=expo.charAt(i);
            }
        }
        return opr;
    }

    private static boolean isDigiti(char charAt) {
        return charAt=='+'||charAt=='-'||charAt=='*'||charAt=='/';
    }

    private static String splitnumber(String expo) {
        String num="";
        for (int i=0;i<expo.length();i++){
            if (Character.isDigit(expo.charAt(i))){
                num+=expo.charAt(i);
            }
        }


        return num;
    }
}
