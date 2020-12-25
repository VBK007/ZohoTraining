package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class frequencyascending {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        int[] array=file.array;
        System.out.println(Arrays.toString(array));
        int[] freq=new int[array.length];
        int visited=-1;

        for (int i=0;i< array.length;i++){
            int count=1;
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    freq[j]=visited;
                    count++;
                }
            }
            if (freq[i]!=visited){
                freq[i]=count;
            }
        }




        for (int i=0;i< freq.length;i++){

            for (int j=i+1;j<freq.length;j++){
                if (freq[i]<freq[j]){
                    int temp=freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp;

                    int tempa=array[i];
                    array[i]=array[j];
                    array[j]=tempa;
                }

                if (freq[i]==freq[j]){
                  if (array[i]>array[j]){
                      int tempa=array[i];
                      array[i]=array[j];
                      array[j]=tempa;
                  }


                }

            }

        }



        for (int i=0;i<freq.length;i++){
            if (freq[i]!=visited){
                for (int j=0;j<freq[i];j++){
                    System.out.print(" | "+array[i]);
                }

            }
        }



    }
}
