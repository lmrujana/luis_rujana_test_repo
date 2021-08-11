package com.sg.fundations.scanner;

import java.util.Scanner;

public class HealthyHeart {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        int age = Integer.parseInt(myScan.nextLine());

        int maximumHeartRate = 220 - age;
        double lowerRange = maximumHeartRate * 0.5;
        double higherRange = maximumHeartRate * 0.85;

        System.out.println("Your maximum heart rate should be: " + maximumHeartRate);
        System.out.println("Your target HR Zone is " + lowerRange + " - " + higherRange + " beats per minute.");
    }
}
