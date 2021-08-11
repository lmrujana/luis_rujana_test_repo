package com.sg.fundations.scanner;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner robotScanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String userName = robotScanner.nextLine();
        System.out.println(userName + "! Nice to meet you. My name is C3P0");

        System.out.println("What's your favorite color");
        String favColor = robotScanner.nextLine();
        System.out.println("Is " + favColor + " your favorite color? I like it, but mine is Orange");

        System.out.println("What's your favorite food?");
        String favFood = robotScanner.nextLine();
        System.out.println("Really? " + favFood + "? I prefer blueberries");

        System.out.println("What's your lucky number?");
        String favNumber = robotScanner.nextLine();
        System.out.println(favNumber + "! That's a good one. Mine is -2");

        System.out.println("Thanks for talking to me!");
    }
}
