package com.company.newfolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class noofgrandchildrenm {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the input number");
        int n = scanner.nextInt();
        int flag;
        System.out.println("Enter the String name");
        String[] input = new String[n];
        ArrayList<String> list = new ArrayList<>();
        String[] father = new String[n];
        String[] child = new String[n];

        for (int i=0;i<n;i++){
            input[i]=scanner.next();
    }


        for (int i=0;i<input.length;i++){
            father[i]="";
            child[i]="";
            flag=0;
            for (int j=0;j<input[i].length();j++){
                if (input[i].charAt(j)==',')
                    flag=1;
                if(((input[i].charAt(j)>='a'&&input[i].charAt(j)<='z')||(input[i].charAt(j)>='A' &&
                        input[i].charAt(j)<='Z'))&&flag==0)
                    child[i]=child[i]+input[i].charAt(j);

                else  if(((input[i].charAt(j)>='a'&&input[i].charAt(j)<='z')||
                        (input[i].charAt(j)>='A'&&input[i].charAt(j)<='Z'))&&flag==1)
                    father[i]=father[i]+input[i].charAt(j);

            }
        }


        System.out.println("Enter the father name to search");
        String search=scanner.next();

        for (int i=0;i<n;i++){
            if (father[i].equals(search)){
                list.add(child[i]);
            }
        }
        int count=0;

        for (int i=0;i<list.size();i++){

            for (int j=0;j<n;j++){
                if (father[j].equals(list.get(i))){
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}
