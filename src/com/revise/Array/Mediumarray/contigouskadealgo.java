package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

public class contigouskadealgo {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();
        int[] array=file.array;
        int maxsofar=0;
        int maxfromend=0;
        int start=0;
        int end=0;
        int beg=0;

        for (int i=0;i<array.length;i++){
            maxfromend=maxfromend+array[i];
            if (maxfromend<0){
                maxfromend=0;
                beg=i+1;
            }
            if (maxsofar<maxfromend){
                maxsofar=maxfromend;
                start=beg;
                end=i;
            }



        }



        System.out.println(maxsofar);
        for (int i=start;i<=end;i++){
            System.out.print(" "+array[i]);
        }


    }
}
