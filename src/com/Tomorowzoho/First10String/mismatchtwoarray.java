package com.Tomorowzoho.First10String;

import java.util.Arrays;

public class mismatchtwoarray {
    public static void main(String[] args) {
        char[] farray={'a','b','c','d','e','f','g','h','i'};
        char[] secarray={'a','b','d','e','e','g','g','i','i'};

        System.out.println(Arrays.toString(farray));
        System.out.println(Arrays.toString(secarray));


        for (int i=1;i<farray.length-1;i++){
            if (farray[i]!=secarray[i]){

                if (farray[i-1]==secarray[i-1]&&farray[i+1]==secarray[i+1]){
                    System.out.print(farray[i]+","+secarray[i]+", ");
                }
                else {
                    System.out.print("{ "+farray[i]+" "+secarray[i]+"} ");
                }

            }



        }






    }
}
