package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter a 1 if you are male or a 2 if you are female: " );
        int sex = input.nextInt();

        System.out.print( "How many ounces of alcohol did you have? " );
        float A = input.nextInt(); //alcohol consumed in oz

        System.out.print( "What is your weight, in pounds? " );
        float W = input.nextInt();

        System.out.print( "How many hours has it been since your last drink? " );
        float H = input.nextFloat();

        float r = sex == 1 ? 0.73f : 0.66f;

        float BAC = (A* 5.14f / W * r) - 0.015f * H;

        String output = BAC > 0.08? "It is illegal for you to drive." : "It is legal for you to drive.";

        System.out.printf("%nYour BAC is %f %n", BAC);
        System.out.println(output);

    }
}
