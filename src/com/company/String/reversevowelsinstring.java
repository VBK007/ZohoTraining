package com.company.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reversevowelsinstring {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String vowels = scanner.nextLine();
char[] array=vowels.toCharArray();
        String vowel="";
        int j=0;
        for (int i = 0; i < array.length; i++) {

            if (isVowels(array[i])) {

            j++;
            vowel+=array[i];

            }
           }
        System.out.println(j+" "+vowel);
        for (int i=0;i<array.length;i++){
            if (isVowels(array[i])){
                array[i]=vowel.charAt(--j);
            }
        }


for (int i=0;i<array.length;i++){
    String str=""+array[i];
    System.out.print(str);
}

    }


    private static boolean isVowels(char charAt) {
        return charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u';


    }


}
