package com.sg.fundations.scanner;

import java.util.Scanner;

public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Welcome to Venezuela Basic Trivia!");

        System.out.println();

        System.out.println("What's the capital of Venezuela?");
        String capital = myScan.nextLine();

        System.out.println("What is the currency of Venezuela?");
        String currency = myScan.nextLine();

        System.out.println("What's the population of Venezuela?");
        String population = myScan.nextLine();

        System.out.println("Who is the president of Venezuela?");
        String president = myScan.nextLine();

        System.out.println("And your answers are: \n" +
                "Capital: " + president + "\n" +
                "Currency: " + capital + "\n" +
                "Population: " + currency + "\n" +
                "President: " + population);

    }
}
