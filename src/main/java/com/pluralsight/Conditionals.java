package com.pluralsight;

public class Conditionals {
    public static void main(String[] args) {

        //create a variable for age
        int age = 43;

        //i want to ask my code a question and do something based
        //on the answer
        if(age >= 21){
            //this is what happens if the condition above is true
            System.out.println("Yay I am 21 or over");
        }else{
            //this is what happens if the above was false
            System.out.println("Dang, I am not over 21");
        }

        //lets try else-if
        String favColor = "purple";

        if(favColor.equals("red")){
            System.out.println("You are a viking");
        } else if (favColor.equals("black")) {
            System.out.println("You are a pirate");
        }else{
            System.out.println("you are nothing");
        }

    }
}
