package com.revise.Array;

public class largestelement {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        int[] array=file.array;
         int latrgestnum=array[0];
int smallnum=array[0];
         for (int i=0;i<array.length;i++){
             for (int j=i+1;j<array.length;j++){
                 if (latrgestnum<array[j]){
                     latrgestnum=array[j];
                 }
                 else if (smallnum>array[j]){
                     smallnum=array[j];
                 }

             }
         }

        System.out.println(latrgestnum);
         System.out.println(smallnum);

    }
}
