
package com.company.application;

import com.company.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        String input = "New Name";
        String reversed = StringUtils.reverse(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
