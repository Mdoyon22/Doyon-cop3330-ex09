/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class Main
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        double sqFPG = 350;
        System.out.print("What is the length? ");
        double length = inp.nextDouble();
        System.out.print("What is the width? ");
        double width = inp.nextDouble();

        double SQTOT = length * width;
        double covered = SQTOT / sqFPG;
        final int gallon = (int)Math.ceil(covered);

        System.out.print("You will need to purchase " + gallon + " gallons of paint to cover " + String.format("%.0f", SQTOT) + " square feet.");
    }
}
