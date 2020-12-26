package com.revise.Array.Hard;

import com.revise.Array.Arrayfile;

public class threshold {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata();
        int[] array = file.array;
        System.out.println("Enter the threshold");
        int threshold = file.scanner.nextInt();
        int remainder = 0;
        int quotient = 0;
        int totalcount = 0;
        for (int i = 0; i < array.length; i++) {


            remainder = array[i] % threshold;
            quotient = array[i] / threshold;


            if (remainder > 0) {
                totalcount += 1;
            }
            if (quotient > 0) {
                totalcount += quotient;
            }


        }

        System.out.println(" || " + totalcount);


    }
}
