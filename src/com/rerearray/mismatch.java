package com.rerearray;

import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        Arrayfiles files=new Arrayfiles();
        files.getdatachar();

        System.out.println(Arrays.toString(files.firstchar));
        System.out.println(Arrays.toString(files.secchar));

        char[] farray=files.firstchar;
        char[] secarray=files.secchar;


        for (int i=1;i<farray.length-1;i++){

            if (farray[i]!=secarray[i]){

                if (farray[i-1]==secarray[i-1]&&farray[i+1]==secarray[i+1]){
                    System.out.print(farray[i]+","+secarray[i]+", ");
                }
                else {
                    System.out.print("{ "+farray[i]+" "+secarray[i]+"} ");
                }

            }
            else if (farray[i]==secarray[i]){
                if (farray[i-1]!=secarray[i-1]){
                    System.out.print("{ "+farray[i]+" "+secarray[i]+"} ");
                }
            }




        }





    }



}
