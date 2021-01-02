package com.rerearray.Stringreres;

import java.util.Arrays;
import java.util.Scanner;

public class numbersysyre {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[20];
        a[0] = 3;
        a[1] = 4;
int k=1;
        for (int i=0;i<n;i++){
            a[++k]=(a[i]*10)+3;
            a[++k]=(a[i]*10)+4;
        }


        System.out.println(Arrays.toString(a));

    }
}
