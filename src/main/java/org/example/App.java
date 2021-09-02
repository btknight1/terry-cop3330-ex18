/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        System.out.print("Your choice: ");
        char choice = input.next().charAt(0);
        int c;
        int f;

        if(choice == 'C' || choice == 'c')
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            f = input.nextInt();
            System.out.printf("The temperature in Celsius is %.2f.", ((f-32)*5/9.0));
        }
        else if(choice == 'F' || choice == 'f')
        {
            System.out.print("Please enter the temperature in Celsius: ");
            c = input.nextInt();
            System.out.printf("The temperature in Celsius is %.2f.", ((c*9/5)+32.0));
        }
    }
}