package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class GivenIpAddress {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the String");
        String ipaddress = sc.nextLine();

        HashSet map=new HashSet<>();

        for (int i = 0; i <= 256; i++) {
            map.add(String.valueOf(i));
        }


        int count = 0;
        for (int i = 0; i < ipaddress.length(); i++) {
            if (ipaddress.charAt(i) == '.') {
                count++;
            }


        }

        if (count < 3) {
            System.out.println("Please eneter Valid Ipaddress");
        }

        String[] array = ipaddress.split("\\.");






        boolean res = methodvalidate(ipaddress, array, map);
        if (res) {
            System.out.println("Valid Ip Adress");
        } else {
            System.out.println("Not Valid");
        }


    }

    private static boolean methodvalidate(String ipaddress, String[] array, HashSet map) {
       for (String x:array){
           if (map.contains(x)){
               return true;
           }
       }
        return false;
    }
}