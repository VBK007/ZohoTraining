package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

public class sumofdigit {
    public static void main(String[] args) {
        Arrayfile file = new Arrayfile();
        file.getdata2();
        int[] farray = file.firstarray;
        int[] secarray = file.secoundarray;

        int[] output = new int[farray.length];
        int k = secarray.length - 2;
        int j=secarray.length-1;
        int l=secarray.length-1;
        for (int i = farray.length - 1; i > 0; i--) {
            int quoitient = farray[i];
            System.out.println(" ff " + farray[i]);

            if (k >=0 && l>0) {
                for (l =j; l > k;l--) {
System.out.println(" "+secarray[j]);
                  int  remainder = quoitient + secarray[j];
                  System.out.println("|| "+remainder );

                    if (remainder > 9) {
                        int rem = remainder % 10;
                        System.out.println(rem);

                        output[i] = rem;
                        System.out.println(" oo "+output[i]);

                        int quoit = remainder / 10;

                        farray[i - 1] += quoit;
                    }
                    output[i] = remainder;

                }
            }

            k--;
            j--;

            output[i] = farray[i];


        }


        for (int i = 0; i < output.length; i++) {
            System.out.print(" | " + output[i]);
        }

    }
}
