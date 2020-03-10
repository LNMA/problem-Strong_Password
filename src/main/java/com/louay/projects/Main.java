package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input your password: ");
        String pass = input.nextLine();
        boolean isPasswordOK = pass.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*\\W)(?=\\S+$).{6,}$");
        boolean isContainCapitalLatter = pass.matches("^(?=.*[A-Z]).+$");
        boolean isContainSmallLatter = pass.matches("^(?=.*[a-z]).+$");
        boolean isContainDigit = pass.matches("^(?=.*\\d).+$");
        boolean isContainSpecChar = pass.matches("^(?=.*\\W).+$");
        boolean isNotContainSpace = pass.matches("^(?=\\S+$).+$");
        boolean isMoreThanSixChar = pass.matches(".{6,}");

        if (isPasswordOK) {
            System.out.println("Your password is OK.");
        } else {
            if (!isMoreThanSixChar) {
                System.out.println("Password length must be at least 6 character.");
            } else if (!isNotContainSpace) {
                System.out.println("Password must not contain whitespace.");
            } else if (!isContainCapitalLatter) {
                System.out.println("Password must contain at least one [A-Z] capital latter.");
            } else if (!isContainSmallLatter) {
                System.out.println("Password must contain at least one [a-z] small latter.");
            } else if (!isContainDigit) {
                System.out.println("Password must contain at least one digit.");
            } else if (!isContainSpecChar) {
                System.out.println("Password must contain at least one special character \'!@#$%^&*()-+\'.");
            }
        }
    }

}
