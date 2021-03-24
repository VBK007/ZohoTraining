package com.Tomorowzoho.First10String.Second10;

import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int[] array={2,2,3,4,5,12,2,3,3,3,12};

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<array.length;i++){
            int count=1;
            for (int j=i+1;j< array.length;j++){
                if (array[i]==array[j]){
                    count++;
                }
            }
          if (!map.containsKey(array[i])){
              map.put(array[i],count);
          }

        }





        System.out.println(Arrays.toString(new HashMap[]{map}));




    }


}
