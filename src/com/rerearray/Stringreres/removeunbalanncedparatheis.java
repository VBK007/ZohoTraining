package com.rerearray.Stringreres;

import java.util.Scanner;

public class removeunbalanncedparatheis {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String paratheis = scanner.nextLine();

        System.out.println("Original String");
        System.out.println(paratheis);

        String res = isvalidedparatheis(paratheis);
        System.out.println(res);

    }

    private static String isvalidedparatheis(String paratheis)
    {
        if (paratheis.length()==0||paratheis.length()==1)
            return paratheis;

        StringBuilder str=new StringBuilder();
        int open=0;
        char[] ch=paratheis.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (paratheis.charAt(i)=='('){
                open++;

            }
            else if (paratheis.charAt(i)==')'){
                if (open==0)
                    continue;
                open--;
            }


            str.append(i);

        }

        StringBuilder result=new StringBuilder();
        for (int i=paratheis.length()-1;i>=0;i--){
            if (paratheis.charAt(i)=='('&&open-->0)
                continue;

            result.append(paratheis.charAt(i));
        }

        return result.reverse().toString();
    }

    private static String isvalidparatheis(String paratheis) {
        if (paratheis.length() == 0 || paratheis.length() == 1)
            return paratheis;

        StringBuilder str = new StringBuilder();
        char[] array = paratheis.toCharArray();
        int open = 0;
        for (int i = 0; i < array.length; i++) {
            if (paratheis.charAt(i) == '(') {
                open++;

            } else if (paratheis.charAt(i) == ')') {
                if (open == 0)
                    continue;

                open--;

            }
            str.append(i);


        }


        StringBuilder result=new StringBuilder();
        for (int i=paratheis.length()-1;i>=0;i--){
            if (paratheis.charAt(i)=='('&&open-->0)
                continue;

            result.append(paratheis.charAt(i));
        }



return result.reverse().toString();
    }
}
