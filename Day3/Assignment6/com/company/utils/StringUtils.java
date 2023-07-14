package com.company.utils;

public class StringUtils {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
