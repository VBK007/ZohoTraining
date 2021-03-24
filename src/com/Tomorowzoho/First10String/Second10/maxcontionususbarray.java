package com.Tomorowzoho.First10String.Second10;

public class maxcontionususbarray {

    public static void main(String[] args) {
        int[] array = {2, 7, 5, 1, 3, 2, 9, 7};

        int max_from_end=0;
        int max_from_start=0;
        int start=0;
        int end=0;
        int i;
        for ( i=0;i<array.length;i++){
            max_from_end+=array[i];

          if (max_from_end<0){
              max_from_end=0;
              start=i+1;
          }
          if (max_from_start<max_from_end){
              max_from_start=max_from_end;
              end=i;
          }


        }

        System.out.println(max_from_start);

        for (int j=start;j<=end;j++){
            System.out.print(array[j]+" ");
        }


    }
}
