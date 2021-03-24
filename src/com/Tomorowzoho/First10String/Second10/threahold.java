package com.Tomorowzoho.First10String.Second10;

public class threahold {
    public static void main(String[] args) {
        int[] array = {5, 8, 10, 13, 6, 2};
        int threhold = 3;

        int totalcount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int remainder = array[i] % threhold;
            int quo = array[i] % threhold;
            count+=quo;
            if (remainder <= 9 && remainder>0) {
                count++;

            }

            totalcount+=count;







        }



        System.out.println(totalcount+" ");


    }
}
