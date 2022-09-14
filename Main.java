package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Menuscreen home = new Menuscreen();

        Beginscreen begin = new Beginscreen();

        Defaultcards cards = new Defaultcards();


        //Main Menu + Start up flash cards
        home.mainMenu();


        //Flashcards

        //Select Card Order
        cards.selectCards();

        //Go Through Cards
        int i;
        i = 0;

        for (i = 0; i < 50; i++) {
            int cardNum = i;

            int presentCard = cards.getCards(cardNum);

            cards.playCards(presentCard);
        }

        home.mainMenu();

    }
}
