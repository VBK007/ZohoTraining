package com.Revise.String;

public class secondstringissubstring {
    public static void main(String[] args) {
        Strings strings=new Strings();
        strings.getdata();
        String ss=strings.ss;
        String fs=strings.fs;
       boolean res=isfound(ss,fs);
        if (res){
            System.out.println("True");
        }
        else {
            System.out.println("FALSE");
        }

    }

    private static boolean isfound(String ss, String fs) {
int count=0;
        for (int i=0;i<ss.length();i++){
            for (int j=0;j<fs.length();j++){
                if (ss.charAt(i)==fs.charAt(j)){
                 count=1;
                }
                else {
                    count=0;
                }
            }
        }

        if (count==1){
            return true;
        }

   return false;
    }
}
