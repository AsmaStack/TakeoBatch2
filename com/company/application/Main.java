package com.company.application;
import com.company.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = StringUtils.reverse(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
