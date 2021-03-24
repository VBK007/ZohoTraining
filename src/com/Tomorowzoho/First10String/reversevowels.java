package com.Tomorowzoho.First10String;

public class reversevowels {
    public static void main(String[] args) {
        String vowels="abcdef";
        String vv="";
        for (int i=0;i<vowels.length();i++){
            if (isVowels(vowels.charAt(i))){
                vv+=vowels.charAt(i);
            }
        }
        int k=vv.length();
        String answer=answer(k,vowels,vv);
        System.out.println(answer);

    }

    private static String answer(int k, String vowels, String vv) {
        String empty="";

        for (int i=0;i<vowels.length();i++){
            if (isVowels(vowels.charAt(i))){
                empty+=vv.charAt(--k);
            }
            else {
                empty+=vowels.charAt(i);
            }
        }

        return empty;
    }

    private static boolean isVowels(char charAt) {
        return charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u';
    }
}
