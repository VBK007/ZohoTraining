package com.rerearray.Haed;

import com.rerearray.Arrayfiles;
import com.revise.Array.Arrayfile;

public class threshold {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        file.getdata1();

        System.out.println("Enter the threshold");
        int k = file.scanner.nextInt();

        int totalcount = 0;
        int[] array = file.firstarray;
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            int remainder = array[i] % k;
            int quotient = array[i] / k;
            count += quotient;
            if (remainder <= 9 && remainder>0) {
                count++;


            }

            totalcount += count;


        }

        System.out.println(" " + totalcount);

    }
}
