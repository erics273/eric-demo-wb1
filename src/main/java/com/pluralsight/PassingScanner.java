package com.pluralsight;

import java.util.Scanner;

public class PassingScanner {

    //create a static properry on the class that all static methods have access to
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //asking the questions
        System.out.println("What is your name?");

        //waiting for the answer and storeing in the "name" variable
        String name = myScanner.nextLine();

        mainMenu();

    }

    public static void mainMenu(){

        System.out.println("what is your favorite color:");
        System.out.println("\tred");
        System.out.println("\tblue");

        String favColor = myScanner.nextLine();

    }

}
