package com.rerearray.Midarray;

import com.rerearray.Arrayfiles;

public class indexfinding {
    public static void main(String[] args) {
        Arrayfiles file=new Arrayfiles();
        file.getdata();

        int[] firstarray=file.firstarray;
        int[] secoundarray=file.secoundarray;

        int[] duplicate=new int[firstarray.length];
        int visited=-1;
        for (int i=0;i< secoundarray.length;i++){
            for (int j=0;j< firstarray.length;j++){
                if (secoundarray[i]==firstarray[j]){
                    duplicate[j]=visited;
                }
            }
        }


        for (int i=0;i< duplicate.length;i++){
            if (duplicate[i]!=visited){
                System.out.println((i+1)+" "+firstarray[i]);
            }
        }



    }
}
