package app;

import java.util.Scanner;
import java.util.Random;

/*
* Students Name:
* Abdulrahman Ali Alhazmi
* Basel Yousef Hazre
*
* IDs:
* [student ID removed]
* [student ID removed]
*
* Group: 
* 31
 */

 /*
* Program Class Defintion
 */
public class App {

    // "Simple Operations Program"
    public static final String PROGRAM = "Simple Operations Program";// declared a constant named "PROGRAM" of type String

    /*
     * This method accepts two integer parameters: 'start' and 'end'. Return nothing. 
     * It validates if 'start' is smaller than 'end'. 
     * If not, it prints an error message and returns without generating any output.
     * If the validation passes, it proceeds to generate the incremental output 
     * starting from 'start' and incrementing by 5 until it reaches or surpasses 'end'.
     */
    public static void generateIncrementalOutput(int start, int end) {

        Scanner scan = new Scanner(System.in);

        while (start >= end) {
            System.out.println("Error: The first integer must be smaller than the second integer!");

            System.out.print("Enter the first number (Smaller): ");
            start = scan.nextInt();

            System.out.print("Enter the second number: ");
            end = scan.nextInt();
        }

        int i = start;
        System.out.print("output is : ");
        while (i <= end) {
            System.out.print(i + " ");
            i += 5; // i = i + 5
        }
        System.out.println();
    }

    /**
     * *************End of generateIncrementalOutput Method****************
     */
    public static boolean guessingNumber(int number) { //static method named "guessingNumber" 
        Random rng = new Random();// it takes opject frome Class Random

        int randomNumber = rng.nextInt(100) + 1; //takes one integer number as a parameter between the range of 1 to 100

        if (number == randomNumber) {
            System.out.println("Congratulations!");//returns true if the number matches a random number and displays "Congratulations!"
            return true;
        } else if (number < randomNumber) {//else method returns false if the number is less than the random number and displays "Too low!"
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println("Too high!");//reutrns false if the number is greater than the random number and displays "Too high!"
            return false;
        }
    }

    /**
     * *************End of guessingNumber Method****************
     */
    public static void main(String[] args) { //Program execution begins with this method.

        System.out.println(PROGRAM); // This prent the constant PROGRAM 
        System.out.println("");
        Scanner scan = new Scanner(System.in);// it take opject frome Class Scanner 

        // Prompt the user to enter two numbers, and clearly tell them: 
        //"Please ensure that the second number is larger than the first number."
        System.out.println("Please enter two number \n(ensure that the second number is larger than the first number)");
        System.out.println(" Enter the first number:");
        int start = scan.nextInt();

        System.out.println("Enter the second number: ");
        int end = scan.nextInt();
        generateIncrementalOutput(start, end);// This passes a values to the methods generateIncrementalOutput
        System.out.println("");
        System.out.println("Enter a number to guess between 1 and 100: ");
        int number = scan.nextInt();

        guessingNumber(number);//This passes a values to the methods guessingNumber
    }
}
