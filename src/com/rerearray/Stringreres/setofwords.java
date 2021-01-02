package com.rerearray.Stringreres;

import java.util.Scanner;

public class setofwords {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] words = new char[][]{{'w', 'e', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'o'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'N', ' '}
        };

        System.out.println("Enter the String to search");
        String search = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j] == search.charAt(0) && seachword(i, j, 0, search, words)) {
                    count = 1;
                }
            }
        }

        if (count == 1) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }


    }

    private static boolean seachword(int i, int j, int index, String search, char[][] words) {
        if (index == search.length()) {

            return true;
        }


        if (i < 0 || i >= words.length || j < 0 || j >= words[i].length) {
            return false;
        }





        return seachword(i + 1, j, index + 1, search, words)
                || seachword(i - 1, j, index + 1, search, words)
                || seachword(i, j + 1, index + 1, search, words)
                || seachword(i, j - 1, index + 1, search, words);


    }
}
