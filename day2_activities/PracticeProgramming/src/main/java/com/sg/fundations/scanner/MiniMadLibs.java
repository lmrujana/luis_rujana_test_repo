package com.sg.fundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS");
        System.out.println();

        System.out.println("I need a noun:");
        String noun = myScan.nextLine();

        System.out.println("Now an adjective:");
        String adjective = myScan.nextLine();

        System.out.println("Another noun:");
        String noun2 = myScan.nextLine();

        System.out.println("And a number:");
        String number = myScan.nextLine();

        System.out.println("Another adjective:");
        String adjective2 = myScan.nextLine();

        System.out.println("A plural noun:");
        String pluralNoun = myScan.nextLine();

        System.out.println("Another plural noun:");
        String pluralNoun2 = myScan.nextLine();

        System.out.println("One more plural noun:");
        String pluralNoun3 = myScan.nextLine();

        System.out.println("A verb (infinitive form):");
        String verbInf = myScan.nextLine();

        System.out.println("Same verb (past participle):");
        String verbPast = myScan.nextLine();

        System.out.println(noun + ": the " + adjective + " frontier. These are the voyages of the starship " + noun2 + " .Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun + ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " + verbInf + " where no ona has " + verbPast + " before.");
    }
}
