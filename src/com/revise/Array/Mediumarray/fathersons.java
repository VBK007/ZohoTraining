package com.revise.Array.Mediumarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class fathersons {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of inputs to put");
        int n = scanner.nextInt();
        String[] input = new String[n];
        String[] father = new String[n];
        String[] child = new String[n];
        ArrayList<String> list = new ArrayList<>();
        int flag;

        for (int i = 0; i < input.length; i++) {
            father[i] = "";
            child[i] = "";
            flag = 0;
            input[i] = scanner.next();
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == ',')
                    flag = 1;
                boolean b = input[i].charAt(j) >= 'A' && input[i].charAt(j) <= 'Z';
                boolean c = input[i].charAt(j) >= 'a' && input[i].charAt(j) <= 'z';

                if ((b || c) && flag == 0) {
                    child[i] = child[i] + input[i].charAt(j);
                } else if ((b || c)) {
                    father[i] = father[i] + input[i].charAt(j);
//                }
//                if (input[i].charAt(j)==',')
//                    flag=1;
//                if(((input[i].charAt(j)>='a'&&input[i].charAt(j)<='z')||(input[i].charAt(j)>='A' &&
//                        input[i].charAt(j)<='Z'))&&flag==0)
//                    child[i]=child[i]+input[i].charAt(j);
//
//                else  if(((input[i].charAt(j)>='a'&&input[i].charAt(j)<='z')||
//                        (input[i].charAt(j)>='A'&&input[i].charAt(j)<='Z'))&&flag==1)
//                    father[i]=father[i]+input[i].charAt(j);


                }


            }

        }

        System.out.println(Arrays.toString(father));
        System.out.println(Arrays.toString(child));
        System.out.println("Enter the father name to search");
        String search = scanner.next();

        for (int i = 0; i < n; i++) {
            if (father[i].equals(search)) {
                list.add(child[i]);
            }
        }

        System.out.println(Arrays.toString(new ArrayList[]{list}));
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < father.length; j++) {
                if (father[j].equals(list.get(i))) {
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}
