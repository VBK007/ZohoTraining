package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class Mergedarray {
    public static void main(String[] args) {

        Arrayfile file=new Arrayfile();
        file.getdata2();

        int[] farray=file.firstarray;
        int[] secarray=file.secoundarray;
        int[] merged=new int[farray.length+secarray.length];

        int i=0;
        while (i<farray.length){
           merged[i]=farray[i];
           i++;
        }
        int t=0;
       for (int k=i;k<merged.length;k++){
           merged[k]=secarray[t++];
       }

        System.out.println("Merged array");
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        System.out.println("Without duplicate");

        int n=mergedarray(merged,merged.length);

        for (int j=0;j<n;j++){
            System.out.print(" "+merged[j]);
        }


    }

    private static int mergedarray(int[] merged, int length) {
        if (length==0||length==1)
            return 1;
        int i=0;
        int[] duplicate=new int[length];
        for (int j=0;j<merged.length-1;j++){
            if (merged[j]!=merged[j+1]){
            duplicate[i++]=merged[j];
            }
        }
        duplicate[i++]=merged[length-1];

       for (int j=0;j<duplicate.length;j++){
           merged[j]=duplicate[j];
       }

return i;

    }
}
