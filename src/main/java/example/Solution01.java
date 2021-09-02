/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Detrich Lange
 */

package example;
import java.util.Scanner;

/*  Create a program that prompts for your name and prints a greeting using your name.
    Perform the input, string concatenation, and output in separate statements.

1: Prompt user for name
2: Take line input from user and set to variable
3: Concatenate output statement using inputted name
4: Print output statement   */

public class Solution01
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is your name? ");
        String Inputname = input.nextLine();

        String Finalstring = "Hello, " + Inputname + ", nice to meet you!";
        System.out.println(Finalstring);
    }
}
