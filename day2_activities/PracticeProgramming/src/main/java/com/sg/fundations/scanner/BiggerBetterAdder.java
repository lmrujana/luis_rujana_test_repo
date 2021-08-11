package com.sg.fundations.scanner;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = Integer.parseInt(myScan.nextLine());

        System.out.println("Enter second number:");
        int b = Integer.parseInt(myScan.nextLine());

        System.out.println("Enter third number:");
        int c = Integer.parseInt(myScan.nextLine());

        System.out.println("The sum of all the numbers is: " + (a+b+c));
    }
}
