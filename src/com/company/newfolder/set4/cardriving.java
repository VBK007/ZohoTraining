package com.company.newfolder.set4;

public class cardriving {
    public static void main(String[] args) {
        int[] pertolbunk = {6, 4, 2};
        int[] distance = {1, 5, 3};
        char[] bunkname = {'A', 'B', 'C'};

        int initalcapacity = 2;

        for (int i = 0; i < pertolbunk.length; i++) {
            int num = 0;

            initalcapacity -= distance[i];
            initalcapacity = Math.abs(initalcapacity);
            initalcapacity += pertolbunk[i];


        }

        System.out.println(initalcapacity);

    }
}
