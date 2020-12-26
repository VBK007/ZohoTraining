package com.revise.Array.Mediumarray;

import com.revise.Array.Arrayfile;

import java.util.Arrays;

public class secondmaximum {
    public static void main(String[] args) {
        Arrayfile file=new Arrayfile();
        file.getdata();

        Arrays.sort(file.array);


        System.out.println(file.array[file.array.length-2]);

    }
}
