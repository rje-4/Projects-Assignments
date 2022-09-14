package com.company;

import java.util.Scanner;

public class Beginscreen {
    Scanner scnr = new Scanner(System.in);

    private Menuscreen home;
    private Listofcards list;

    public void startCards() {

        String startButton;
        boolean starter;

        home = new Menuscreen();

        list = new Listofcards();

        starter = false;

        while (starter == false) {
            System.out.println("To begin going through flashcards press 0. Press 1 to quit. Type VIEWALL to see all cards and " +
                    "answers");

            startButton = scnr.next();

            if (startButton.equals("0")) {
                starter = true;

                //Starts flashcards
            }

            else if (startButton.equals("1")) {
                starter = true;
                home.mainMenu();

                //Returns to selection of default cards or custom
            }

            else if (startButton.equals("VIEWALL") || startButton.equals("viewall")) {
                starter = true;
                list.listCards();

                //Returns to selection of default cards or custom
            }

            else {
                System.out.println("Invalid input.");
            }
        }

    }



}
