package com.pluralsight;

//if we want to use the scanner it needs to be imported
import java.util.Scanner;

public class ScannerRiffic {
    public static void main(String[] args) {

        //set up the scanner y'all, we use this as our tool
        //to capture input from the user
        Scanner myScanner = new Scanner(System.in);

        //ask the user a question with System.out.print*
        System.out.println("What is your name?");

        //just print the answer they gave
        //System.out.println( myScanner.nextLine() ) ;

        //store the answer in a variable
        String name = myScanner.nextLine();
        System.out.println("the name provided was " + name);


        //lets do some math
        //thats ask the user for the first number
        System.out.println("Give me the first number:");
        //create variable to store the answer
        int firstNumber = myScanner.nextInt();

        //thats ask the user for the second number
        System.out.println("Give me the second number:");
        //create variable to store the answer
        int secondNumber = myScanner.nextInt();

        //sum the two numbers
        int sum = firstNumber + secondNumber;

        //print the sum
        System.out.println("The sum of the numbers is: " + sum);

        //show what happens with mixed data types

        //lets start with a number
        System.out.println("what is your favorite number?");
        int favNum = myScanner.nextInt();
        System.out.println("Your favorite number is: " + favNum);

        //manually eat the newline so it doesnt press enter for you
        myScanner.nextLine();

        //now ask for favorite color
        System.out.println("What is your favorite color?");
        String favcColor = myScanner.nextLine();
        System.out.println("Your favorite color is: " + favcColor);


    }
}
