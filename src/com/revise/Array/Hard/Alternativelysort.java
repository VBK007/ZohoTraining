package com.revise.Array.Hard;

import com.revise.Array.Arrayfile;

import java.util.ArrayList;
import java.util.Arrays;

public class Alternativelysort {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata4();

        char[] farray=file.farray;
        char[] secarray=file.secarray;
//        ArrayList<Character> characters=new ArrayList<>();
//        ArrayList<Character> characters1=new ArrayList<>();
//        for (int i=0;i<farray.length;i++){
//            characters.add(i,farray[i]);
//        }
//        for (int i=0;i<secarray.length;i++){
//            characters1.add(i,secarray[i]);
//        }
//
//
//        for (int i=0;i<characters.size();i++){
//            if (characters.get(i)!=characters1.get(i)){
//                System.out.print(" { "+characters.get(i)+" "+characters1.get(i)+"} ");
//            }
//        }




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
