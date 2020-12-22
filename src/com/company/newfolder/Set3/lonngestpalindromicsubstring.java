package com.company.newfolder.Set3;

import java.util.Locale;
import java.util.Scanner;

public class lonngestpalindromicsubstring {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();

        String substr = gindSubstringpalindomic(str1, str1.length());

        System.out.println(substr);
    }

    private static String gindSubstringpalindomic(String str1, int length) {
        int start = 0;
        int end = 0;
        if (length < 1) {
            return " ";
        }

        for (int i = 0; i < str1.length(); i++) {
            int len1 = findMaxlenth(str1, i, i);
            int len2 = findMaxlenth(str1, i, i + 1);
int len=Math.max(len1,len2);
if (len>end-start){

    start=i-((len)-1)/2;
    end=i+(len/2);
}

        }

        return str1.substring(start, end + 1);
    }

    private static int findMaxlenth(String str1, int left, int right) {
        if (left > right || str1 == null) {
            return 0;
        }

        while (left >= 0 && right < str1.length() && str1.charAt(left) == str1.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}


//    private static String gindSubstringpalindomic(String str1, int length) {
//        int start = 0;
//        int end = 0;
//
//        if (length < 1)
//            return " ";
//        for (int i = 0; i < str1.length(); i++) {
//            int l1 = fidmaxlen(str1, i, i);
//            int l2 = fidmaxlen(str1, i, i + 1);
//
//            int len = Math.max(l1, l2);
//
//            if (len > end - start) {
//                start = i - ((len - 1) / 2);
//                end = i + (len / 2);
//            }
//        }
//
//        return str1.substring(start, end + 1);
//
//    }
//
////    private static int fidmaxlen(String str1, int left, int right) {
////
////        if (left > right || str1 == null) {
////            return 0;
////        }
////
////        while (left >= 0 && right < str1.length() && str1.charAt(left) == str1.charAt(right)) {
////            left--;
////            right++;
////
////        }
////
////        return right - left - 1;
////
////
////    }
//}
