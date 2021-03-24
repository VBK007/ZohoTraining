package com.This.Time.Zoho.ArrayProgram.String.Substring;

public class Substring {
    public static void main(String[] args) {
        String str1="test123string";
        String str2="123";
        int index=returnindex(str1,str2);
       System.out.println(index);
       str1="testing12";
       str2="1234";
        index=returnindex(str1,str2);
        System.out.println(index);


    }

    private static int returnindex(String str1, String str2) {
        int index=-1;

        for (int i=str2.length()-1;i>=0;i--){
            int j;
            for (j=0;j<str1.length();j++){
                if (str2.charAt(i)==str1.charAt(j)){
                    index=j;
                }
            }
            if (j==str1.length()){
               if (index==-1){
                   break;
               }
            }

        }



      return index;
    }
}
