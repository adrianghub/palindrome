package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("_________________PALINDROME___________________");

        Palindrome palindrome = new Palindrome();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type word or sentence to verify: ");

        while(scanner.hasNextLine()) {
            if(palindrome.checkIsPalindrome(scanner.nextLine())) {
                System.out.println("It's a PALINDROME!!!!!!!");
            } else {
                System.out.println("Nah...");
            }
        }
    }
}
