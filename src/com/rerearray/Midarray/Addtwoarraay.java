package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

import java.util.Arrays;

public class Addtwoarraay {
    public static void main(String[] args) {
        Arrayfiles file = new Arrayfiles();
        Arrayfiles.getdata();
        int[] farray = Arrayfiles.firstarray;
        int[] secarray = Arrayfiles.secoundarray;
        int s2 = secarray.length;
        int s = secarray.length - 1;
        int[] adding = new int[farray.length];
        for (int i = farray.length - 1; i >= 0; i--) {


            if (s2 > 0) {
                int add = farray[i] + secarray[s];

                if (add > 9) {
                    int remainder = add % 10;
                    adding[i] = remainder;
                    int quotient = add / 10;
                    farray[i - 1] += quotient;

                }
                else {
                    adding[i] = add;
                }
            }
            s2--;
            s--;
            if (s2 < 0) {
                adding[i] = farray[i];
            }

        }


        for (int i = 0; i < adding.length; i++) {
            System.out.print(" " + adding[i]);
        }

    }
}
