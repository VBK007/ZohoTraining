package com.This.Time.Zoho.ArrayProgram.String.StringArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFather {
    public static void main(String[] args) {
        String[][] array = {{"luke", "shaw"},
                {"wayne", "rooney"}, {"rooney", "ronaldo"}, {"shaw", "rooney"}};
        String[] father = new String[array.length];
        String[] child = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == 0) {
                    child[i] = array[i][j];
                } else {
                    father[i] = array[i][j];
                }
            }
        }

        System.out.println(Arrays.toString(father));
        System.out.println(Arrays.toString(child));
        ArrayList<String> list = new ArrayList<>();
        String search = "ronaldo";
        for (int i = 0; i < father.length; i++) {
            if (father[i].equals(search)) {
                list.add(child[i]);
            }
        }
        int count=0;
        for (int i=0;i<list.size();i++){
            for (int j=0;j<array.length;j++){
                if (father[j].equals(list.get(i))){
                    count++;
                }
            }
        }

System.out.println(search + "contains "+count+ " of grand children");

    }
}
