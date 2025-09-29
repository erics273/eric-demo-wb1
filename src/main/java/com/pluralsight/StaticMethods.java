package com.pluralsight;

public class StaticMethods {

    public static void main(String[] args) {

        //standard output to the screen using println
        System.out.println("Hello, Eric!");

        //call a method to do something, maybe sayHello
        sayHello("Eric");
        sayHello("Jazzy");
        sayHello("Alwin");

        int sumOfTheNumbers = addNumbers(1, 6);
        int sumOfTheOtherNumbers = addNumbers(8, 8);

        System.out.println(sumOfTheNumbers);
        System.out.println(sumOfTheOtherNumbers);
    }

    public static void sayHello(String name){
        System.out.println("Hello, "+ name +"! from inside the method");
    }

    public static int addNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static String sayWords(){
        return "Hello!";
    }

}
