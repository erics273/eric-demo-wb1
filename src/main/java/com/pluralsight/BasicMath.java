package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicMath {
    public static void main(String[] args) {

        /*
        String Concatenation
         */

        //declaring some variables and initializing their values
        String word1 = "Hello";
        String word2 = "World";

        //declaring a greeting variable
        String greeting;

        //concatenation with "+" operator
        greeting = word1 + " " + word2 + "!";

        //print our greeting variable to the console
        System.out.println(greeting);

        /*
        Basic Math operations
         */

        //declare some variables to hold whole numbers
        int a = 10;
        int b = 3;

        int result;

        result = a + b;
        System.out.println(result); // displays 13
        result = a - b;
        System.out.println(result); // displays 7
        result = a * b;
        System.out.println(result); // displays 30
        result = a / b;
        System.out.println(result); // displays 3
        result = a % b;
        System.out.println(result); // displays 1

        /*
        Working with floats or doubles
         */
        float a1 = 10;
        float b1 = 3;
        float result2;
        result2 = a1 + b1;
        System.out.println(result2); // displays 13.0
        result2 = a1 - b1;
        System.out.println(result2); // displays 7.0
        result2 = a1 * b1;
        System.out.println(result2); // displays 30.0
        result2 = a1 / b1;
        System.out.println(result2); // displays 3.3333333
        result2 = a1 % b1;
        System.out.println(result2); // displays 1.0
        result2 = b1 - (a1 % b1);
        System.out.println(result2); // displays 2.0

        /*
        Pre and post increment
         */

        int someNum = 76;
        //anotherNumber will still be 76 becasue the increment happened after the assignment
        int anotherNumnber = someNum++;
        System.out.println(anotherNumnber);
        System.out.println(someNum);

        //loop to the number 10 using post increment to change the value of i on each iteration
        for (int i = 1; i <= 10; i++) {
             System.out.println(i);
        }

      /*
      type casting
       */

        long myLong = 9;
        int myInt;

        // you know the range of values in the long variable
        // will always fit in the int
        myInt = (int) myLong;

        /*
        Examples of the math library
         */

        //how to round a number to the nearest whole number using Math.round
        double value = 35.5;
        long wholeNumber = Math.round(value);
        System.out.println(wholeNumber);

        //figure out the max numbner in a set of numbers
        int firstNumber = 65;
        int secondNumber = 12;

        System.out.println( Math.max(secondNumber, firstNumber) );

        //figure out the min numbner in a set of numbers

        System.out.println( Math.min(secondNumber, firstNumber) );

        int natKidCount = 2;
        int brittKidCount = 4;

        int mostKids = Math.max(natKidCount, brittKidCount);

        System.out.println("The biggest family has " + mostKids + " kids");

        //generate a random number
        System.out.println( Math.random() );

        /*
        assignment operations
         */

        int answer = 0;
        //original way
//        answer = answer + 10; // 10
//        answer = answer - 5; // 5
//        answer = answer * 10; // 50
//        answer = answer / 2; // 25
//        answer = answer % 10; // 5 (int remainder of 25 / 10)

        //shorthand way
        answer += 10; // 10 samesies: answer = answer + 10; // 10
        answer -= 5; // 5
        answer *= 10; // 50
        answer /= 2; // 25
        answer %= 10; // 5 (int remainder of 25 / 10)

    }
}