package com.pluralsight;

public class StringFormatting {
    public static void main(String[] args) {

        //print to the screen using System.out.print()
        //prints out the text but doesnt add a CR/LF (doesnt hit the enter key)
        System.out.print("Eric");
        System.out.print("Craig");
        System.out.print("Schwartz");


        //print to the screen using System.out.print()
        //prints out the text but doesnt add a CR/LF (doesnt hit the enter key)
        //what if we add the \n escape character
        System.out.print("Eric\n");
        System.out.print("Craig\n");
        System.out.print("Schwartz");

        //print to the screen using System.out.println()
        //this takes care of making sure each thing in printed on its own line in the console
        //no need for \n or any other escape characters
        System.out.println("Eric");
        System.out.println("Craig");
        System.out.println("Schwartz");

        //formatting strings with System.out.printf()
        String firstName = "eric";
        double crazyDecimal = 123.4567;

        System.out.printf("Hi! my name is %s and my favorite decimal $%.2f. I really like the number %d as well", firstName, crazyDecimal, 27);
        System.out.printf("Hi! my name is %s and my favorite decimal $%.2f. I really like the number %d as well", firstName, crazyDecimal, 27);

        //doing the same thing with concatenation
        System.out.println("Hi! my name is "+ firstName +" and my favorite decimal " + crazyDecimal + " I really like the number "+ 27 +" as well");

        //random example of preformattd text using """
        String text = """
                sadffads
                asdf;lsdfksadf;lksd;flk
                sa;opfk;sldfk;fdk
                asf.jadfs;lks
                sad.flks;dflaks
                """;

        System.out.println(text);

    }
}
