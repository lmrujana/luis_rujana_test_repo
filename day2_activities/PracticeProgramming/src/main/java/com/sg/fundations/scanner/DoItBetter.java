package com.sg.fundations.scanner;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("How many miles can you run?");
        double miles = Double.parseDouble(myScan.nextLine());
        System.out.println(miles + "? I can run " + (miles*2+1) + "!");

        System.out.println("How many hot dogs can you eat?");
        int hotDogs = Integer.parseInt(myScan.nextLine());
        System.out.println(hotDogs + "? I can eat " + (hotDogs*2+1) + "!");

        System.out.println("How many languages do you know?");
        int languages = Integer.parseInt(myScan.nextLine());
        System.out.println(languages + "? I know " + (languages*2+1) + " languages!");
    }
}
