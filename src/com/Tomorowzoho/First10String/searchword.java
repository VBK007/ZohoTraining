package com.Tomorowzoho.First10String;

public class searchword {
    public static void main(String[] args) {
        char[][] array = new char[][]{
                {'W', 'E', 'L', 'C', 'O'},
                {'M', 'E', 'T', 'O', 'Z'},
                {'O', 'H', 'O', 'C', 'O'},
                {'R', 'P', 'O', 'R', 'A'},
                {'T', 'I', 'O', 'N', ' '}


        };

        String search="WEM";
boolean isfound=false;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                if (array[i][j]==search.charAt(0) && searchwords(i,j,0,search,array)){
                isfound=true;
                }
            }
        }


        if (isfound){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }

    private static boolean searchwords(int i, int j, int index, String search, char[][] array) {
    if (index==search.length()){
        return true;
    }

    if (i<0||i>=array.length||j<0||j>=array[0].length||array[i][j]!=search.charAt(index)){
        return false;
    }

    char temp=array[i][j];
    array[i][j]=' ';




    boolean found= searchwords(i+1,j,index+1,search,array)||
            searchwords(i-1,j,index+1,search,array)||
            searchwords(i,j+1,index+1,search,array)||
            searchwords(i,j-1,index+1,search,array);

    array[i][j]=temp;

    return found;


    }
}
