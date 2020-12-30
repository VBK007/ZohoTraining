package com.Revise.String;

import com.revise.Array.Arrayfile;

public class possiblekdidit {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata();
        int[] array = file.array;
        System.out.println("Enter the number of digits");
        int n = file.scanner.nextInt();

        String str = "";
        int max = 0;
        for (int i = array.length - 1; i > 0; i--) {
            String s1 = array[i] + "";
            for (int j = array.length - 1; j > 0; j--) {
                String s2 = s1 + array[j];
                if (s2.length() == n) {
                    max = Integer.parseInt(String.valueOf(str));
                    s2 = "";
                }




            }


        }


    }
}
