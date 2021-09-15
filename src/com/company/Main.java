package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[]args) {
        //Think Java - Exercise 6.2

        Scanner userInput = new Scanner(System.in);

        //Program waiting for user input.
        System.out.println("Insert a value you want to find square roof of here: ");
        double a = userInput.nextDouble();

        //Program waiting for user input.
        System.out.println("What do you think the result will be? ");
        double guess = userInput.nextDouble();

        //invokes method.
        squareRoot(a, guess);

        //The last two outputs.
        System.out.print("This is the correct answer = ");
        System.out.println(squareRoot(a, guess));


    }

    public static double squareRoot(double a, double guess) {

        //Variables.
        double userInput = a;
        double x = guess;
        double oldX = -1;

        //Fori loop.
        for (int i = 0; (Math.abs(x-oldX) > 0.00001 ) && (i < 10); i++) {

            //THe loop will keep using the new value of x until it reach the end of the loop. Exsample: a = 9, guess = 6 ---> WIll be x = (6 + 9/6)/2 = 3.75
            //The result 3.75 will be used in the next run in the loop ---> x = (3.75 + 9/3.75) / 2 = 3.075  and etc. until the loop ends.
            oldX = x;
            x = (x + a/x) / 2;

        }

        //Returns x value to main.
        return (x);

    }
}
