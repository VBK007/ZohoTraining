package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class findindexofarray {

    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata2();

      int[] farray=file.firstarray;
int[] secarray=file.secoundarray;

int n=findindex(farray,secarray);

System.out.println(n);

    }

    private static int findindex(int[] farray, int[] secarray) {

        int[]  visited=new int[farray.length];
        int visit=-1;
        for (int i=0;i<secarray.length;i++){
            for (int j=0;j<farray.length;j++){
                if (secarray[i]==farray[j]){
                    visited[i]=-1;
                    break;
                }
            }
        }


        for (int i=0;i<visited.length;i++){
            if (visited[i]!=visit){
                return  i;
            }
        }

        return 0;
    }
}
