package com.This.Time.Zoho.ArrayProgram.String.StringArray;

public class searchwords {
    public static void main(String[] args) {
        char[][] array = new char[][]{{'w', 'e', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'o'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'N', ' '}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        String search = "fucko".toUpperCase();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == search.charAt(0) && searchword(i, j, 0, array, search)) {
                    count = 1;
                }

            }
        }

        if (count == 1) {
            System.out.println("Yes found");
        } else {
            System.out.println("Not found");
        }

    }

    private static boolean searchword(int i, int j, int index, char[][] array, String search) {
        if (index == search.length()) {
            return true;
        }
        if (i < 0 || i >= array.length || j < 0 || j >= array[i].length) {
            return false;
        }

        return searchword(i + 1, j, index + 1, array, search) ||
                searchword(i - 1, j, index + 1, array, search) ||
                searchword(i, j + 1, index + 1, array, search) ||
                searchword(i, j - 1, index + 1, array, search);

    }
}
