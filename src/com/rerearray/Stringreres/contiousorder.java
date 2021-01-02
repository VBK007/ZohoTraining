package com.rerearray.Stringreres;

import java.util.Scanner;

public class contiousorder {
    static String string;
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
         string = scanner.nextLine();
       x(string,"");
       System.out.println("-------------");

    }

    private static void x(String string, String s) {
        if(string.isEmpty()){
            System.out.println(s);
        }
        else {
          int num=Integer.parseInt(string.substring(0,1));
          x(string.substring(1),s+(char)('A'+num-1));
          if (string.length()>=2&&(num=Integer.parseInt(string.substring(0,2)))<=26)
              x(string.substring(2),s+(char)('A'+num-1));
        }





    }

    private static String substringi(int i) {
        String str=" ";
        for (int j=i;j<string.length();j++){
            str+=string.charAt(j);
        }
        return str;
    }

    private static int parseit(String sub) {
        int num=0;
        for (int i=0;i<sub.length();i++){
            num+=sub.charAt(i)-48;

        }
        return num;
    }

    private static String sub(int index, int end) {
        String str="";
        for (int i=index;i<end;i++){
            str+=string.charAt(i);
        }
        return str;
    }


}
