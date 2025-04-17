package org.example;

import java.util.Scanner;

public class FullName {
    static Scanner asking = new Scanner(System.in);
    static char enterChar = '↵';
    static String firstName;
    static String middleName;
    static String lastName;
    static String fullName;
    public static void Parse() {
        System.out.println("Please enter your name:");
        fullName = asking.nextLine().trim();
        System.out.println();
        String[] splitName = fullName.split("\\s+");

        if (splitName.length == 2) {
            firstName = splitName[0];
            lastName = splitName[1];
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else if (splitName.length == 3) {
            firstName = splitName[0];
            middleName = splitName[1];
            lastName = splitName[2];
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("!!ERROR!! !!iNVALID INPUT!!");
        }

    }
}
