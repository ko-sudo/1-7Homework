package com.company;

public class Main {

    public static void main(String[] args) {



        System.out.println("Enter a name: ");
        String name = input.nextLine();
        //System.out.println("Give me an adverb: ");
        String adverb = input//.nextLine();
        System.out.println(" Give me an adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a noun: ");
        String noun = input.nextLine();
        System.out.println("Give me a city: ");
        String city = input.nextLine();
        System.out.println("Give me a number: ");
        String number = input.nextLine();
        System.out.println("Give me your name: ");
        String yourName = input.nextLine();

        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun) //;
        System.out.printf("\n I can't wait to see you at %s in %s days!", city, number);
        System.out.printf("\n Sincerely, %s \n", yourName);


    }
}
