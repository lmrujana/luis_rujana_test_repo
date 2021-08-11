package com.mthree;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        float width;
        float height;

        String stringHeight;
        String stringWidth;

        float areaOfWindow;
        float perimeterOfWindow;
        float cost;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width");
        stringWidth = myScanner.nextLine();

        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);

        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        System.out.println("Window height: " + height);
        System.out.println("Window width: " + width);
        System.out.println("Window area: " + areaOfWindow);
        System.out.println("Window perimeter: " + perimeterOfWindow);
        System.out.println("Total cost: " + cost);
    }
}
