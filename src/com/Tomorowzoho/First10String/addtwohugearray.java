package com.Tomorowzoho.First10String;

import java.util.Arrays;

public class addtwohugearray {
    public static void main(String[] args) {
        int[] farray={9,2,8,1,3,5,6,7,3,1,1,6};
        int[] secarray={7,8,4,6,2,1,9,9,7};


        int[] adding=new int[farray.length];

        int s2 = secarray.length;
        int s = secarray.length - 1;
        for (int i=farray.length-1;i>=0;i--){
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

        System.out.println(Arrays.toString(adding));

    }
}
