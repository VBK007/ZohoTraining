package com.rerearray.Haed;

import com.rerearray.Arrayfiles;

public class Alternativelysort {
    public static void main(String[] args) {

        Arrayfiles files = new Arrayfiles();
        files.getdata1();
        int[] firstarray = files.firstarray;
        System.out.println("Enter the k values ");
        int k = files.scanner.nextInt();

        for (int i = 0; i < firstarray.length; i++) {
            int j;
            int max = firstarray[i];

            for (j = i; j < k + i; j++) {
                if (max < firstarray[j]) {
                    max = firstarray[j];
                }
            }
            System.out.print(max+" ");

            if (j == firstarray.length) {
                break;
            }

        }


    }
}
