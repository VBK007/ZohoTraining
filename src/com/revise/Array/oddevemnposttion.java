package com.revise.Array;

public class oddevemnposttion {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        for (int i=0;i<file.array.length;i++){
            if (i%2==0){
                System.out.print(" "+file.array[i]);
            }
            if (i%2==1){
                System.out.print(" || "+file.array[i]);
            }
        }

    }
}
