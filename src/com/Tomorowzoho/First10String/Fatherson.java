package com.Tomorowzoho.First10String;

import java.util.ArrayList;
import java.util.List;

public class Fatherson {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"like", "shaw"},
                {"wayne", "rooney"},
                {"rooney", "ronaldo"},
                {"shaw", "rooney"}
        };
        String[] father = new String[array.length];
        String[] child = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    child[i] = array[i][j];
                } else {
                    father[i] = array[i][j];
                }
            }
        }
        String search = "ronaldo";
        List<String> arraylist = new ArrayList<>();

        for (int i = 0; i < father.length; i++) {
            if (father[i].equals(search)) {
                arraylist.add(child[i]);
            }
        }

        int count = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (father[j].equals(arraylist.get(i))) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }

}
