package com.company;

import java.util.Scanner;

public class Menuscreen {
    Scanner scnr = new Scanner(System.in);

    Beginscreen begin;

    Customcards custom;

    public void mainMenu() {

        String intro;
        boolean validInput;

        begin = new Beginscreen();

        custom = new Customcards();

        validInput = false;

        //Repeats menu until it gets a valid input

        while (validInput == false) {

            System.out.println("To start please press 0 to use default cards, or press 1 to enter custom cards.");

            intro = scnr.next();

            if (intro.equals("0")) {
                validInput = true;
                System.out.println("Welcome.");
                begin.startCards();
                //Starts up the default card menu
            }

            else if (intro.equals("1")) {
                validInput = true;
                System.out.println("Welcome.");
                custom.getCustomCards();
            }

            else {
                System.out.println("Invalid input");
            }

        }
    }




}
