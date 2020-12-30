package com.revise.Array.Mediumarray;

import java.util.Arrays;
import java.util.Scanner;

public class reversevowelsinit {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String input=scanner.nextLine();

        char[] ch=input.toCharArray();

       String str="";
       int j=0;
        for (int i=0;i<ch.length;i++){
            if (isvowel(ch[i])){
                j++;
               str+=ch[i];
            }
        }

        for (int i=0;i<ch.length;i++){
            if (isvowel(ch[i])){
              ch[i]=str.charAt(--j);
            }
        }

        System.out.println(Arrays.toString(ch));



    }

    private static boolean isvowel(char charAt) {
        return charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u';

    }
}
