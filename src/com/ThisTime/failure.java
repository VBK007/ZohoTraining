package com.ThisTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class failure {
    public static void main(String[] args) {

        int[] array={0,1,2,3,4,5,6,7,8};
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for (int i=0;i< array.length;i++){
          if (i%2==1){
              odd.add(array[i]);
          }
          else {

              even.add(array[i]);

          }
        }

        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(odd);

        for (int i=0;i<odd.size();i++){

            System.out.print(even.get(i)+" , "+odd.get(i)+", ");
        }





    }
}
