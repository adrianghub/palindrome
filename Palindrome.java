package com.company;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public boolean checkIsPalindrome(String string) {

        if(string.length() < 1) {
            throw new IllegalArgumentException("Digits are not acceptable");
        }

        if(string.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Type only characters");
        }

        String trimmedString = string.trim();

        int i = 0, j = trimmedString.length() - 1;

        System.out.println("Checking if " + trimmedString + " is a palindrome...");

        while(i < j) {
            if(trimmedString.charAt(i) != trimmedString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
