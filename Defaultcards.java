package com.company;

import java.util.Scanner;

import java.util.Arrays;

import java.util.Random;


public class Defaultcards {

    Scanner scnr = new Scanner(System.in);

    Random rand = new Random();

    Menuscreen home = new Menuscreen();

    private int i;

    private int randomIndex;
    private int swappedIndex;

    private int playcard;

    int[] numList = new int[50];

    public void selectCards() {

        i = 0;

        System.out.println("Press Enter to flip a card. Enter 'N' or 'n' to go to the next card. Press 1 to quit.");
        System.out.println("");

        for (i = 0; i < numList.length; i++) {
            numList[i] = i;
        }

        i = 0;

        for (i = 0; i < numList.length; i++) {
            randomIndex = rand.nextInt(numList.length);
            swappedIndex = numList[randomIndex];
            numList[randomIndex] = numList[i];
            numList[i] = swappedIndex;
        }


    }

    public int getCards(int cardNum) {
        int n;

        n = cardNum;

        return numList[n];

    }

    public void playCards(int presentCard) {
        playcard = presentCard;

        if (playcard == 0) {
            card1();
        }
        if (playcard == 1) {
            card2();
        }
        if (playcard == 2) {
            card3();
        }
        if (playcard == 3) {
            card4();
        }
        if (playcard == 4) {
            card5();
        }
        if (playcard == 5) {
            card6();
        }
        if (playcard == 6) {
            card7();
        }
        if (playcard == 7) {
            card8();
        }
        if (playcard == 8) {
            card9();
        }
        if (playcard == 9) {
            card10();
        }
        if (playcard == 10) {
            card11();
        }
        if (playcard == 11) {
            card12();
        }
        if (playcard == 12) {
            card13();
        }
        if (playcard == 13) {
            card14();
        }
        if (playcard == 14) {
            card15();
        }
        if (playcard == 15) {
            card16();
        }
        if (playcard == 16) {
            card17();
        }
        if (playcard == 17) {
            card18();
        }
        if (playcard == 18) {
            card19();
        }
        if (playcard == 19) {
            card20();
        }
        if (playcard == 20) {
            card21();
        }
        if (playcard == 21) {
            card22();
        }
        if (playcard == 22) {
            card23();
        }
        if (playcard == 23) {
            card24();
        }
        if (playcard == 24) {
            card25();
        }
        if (playcard == 25) {
            card26();
        }
        if (playcard == 26) {
            card27();
        }
        if (playcard == 27) {
            card28();
        }
        if (playcard == 28) {
            card29();
        }
        if (playcard == 29) {
            card30();
        }
        if (playcard == 30) {
            card31();
        }
        if (playcard == 31) {
            card32();
        }
        if (playcard == 32) {
            card33();
        }
        if (playcard == 33) {
            card34();
        }
        if (playcard == 34) {
            card35();
        }
        if (playcard == 35) {
            card36();
        }
        if (playcard == 36) {
            card37();
        }
        if (playcard == 37) {
            card38();
        }
        if (playcard == 38) {
            card39();
        }
        if (playcard == 39) {
            card40();
        }
        if (playcard == 40) {
            card41();
        }
        if (playcard == 41) {
            card42();
        }
        if (playcard == 42) {
            card43();
        }
        if (playcard == 43) {
            card44();
        }
        if (playcard == 44) {
            card45();
        }
        if (playcard == 45) {
            card46();
        }
        if (playcard == 46) {
            card47();
        }
        if (playcard == 47) {
            card48();
        }
        if (playcard == 48) {
            card49();
        }
        if (playcard == 49) {
            card50();
        }

    }

    public void card1() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A sequence of instructions that solves a problem is called an ");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Algorithm") || input.equals("algorithm") || input.equals(""))
            {
                System.out.println("Algorithm.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
            || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card2() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("When a program gets data, perhaps from a file, keyboard, touchscreen, network, etc ");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Input") || input.equals("input") || input.equals(""))
            {
                System.out.println("Input.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card3() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("When a program puts data somewhere, such as to a file, screen, network, etc.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Output") || input.equals("output") || input.equals(""))
            {
                System.out.println("Output.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card4() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("When a program performs computations on that data, such as adding two values like x + y.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Process") || input.equals("process") || input.equals(""))
            {
                System.out.println("Process.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card5() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Text in code that is meant to be read by the programmer but is ignored by the compiler.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Comments") || input.equals("comments") || input.equals(""))
            {
                System.out.println("Comments.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card6() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("To violate a programming language's rules on how symbols can be combined to create a program");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Syntax error") || input.equals("syntax error") || input.equals(""))
            {
                System.out.println("Syntax error.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card7() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Occurs when a program compiles successfully but does not function correctly.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Logic error") || input.equals("logic error") || input.equals(""))
            {
                System.out.println("Logic error.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card8() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A named item used to hold a value.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Variable") || input.equals("variable") || input.equals(""))
            {
                System.out.println("Variable.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card9() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Increasing a variable's value by 1, as in x = x + 1, is common, and known as");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Incrementing") || input.equals("incrementing") || input.equals(""))
            {
                System.out.println("Incrementing.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card10() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Any individual item or combination of items, like variables, literals, operators, and parenthesis that evaluates to a value, like 2 * (x + 1).");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Expression") || input.equals("expression") || input.equals(""))
            {
                System.out.println("Expression.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card11() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A sequence of statements only executed under a certain condition");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Branch") || input.equals("branch") || input.equals(""))
            {
                System.out.println("Branch.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card12() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Each execution of the loop body is called an");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Iteration") || input.equals("iteration") || input.equals(""))
            {
                System.out.println("Iteration.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card13() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A ______ loop is a loop with three parts at the top: a loop variable " +
                "initialization, a loop expression, and a loop variable update.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("For") || input.equals("for") || input.equals(""))
            {
                System.out.println("For.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card14() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("This keyword is used to define a constant variable");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Final") || input.equals("final") || input.equals(""))
            {
                System.out.println("Final.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card15() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A program construct that repeatedly executes statements.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Loop") || input.equals("loop") || input.equals(""))
            {
                System.out.println("Loop.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card16() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A special variable having one name, but " +
                "storing a list of data items, with each item being directly accessible.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Array") || input.equals("array") || input.equals(""))
            {
                System.out.println("Array.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card17() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Each item in an array is known as an");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Element") || input.equals("element") || input.equals(""))
            {
                System.out.println("Element.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card18() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("In an array, each element's location number is called the");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Index") || input.equals("index") || input.equals(""))
            {
                System.out.println("Index.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card19() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A named list of statements.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Method") || input.equals("method") || input.equals(""))
            {
                System.out.println("Method.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card20() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A method input specified in a method definition.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Argument") || input.equals("argument") || input.equals(""))
            {
                System.out.println("Argument.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card21() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A grouping of data " +
                "(variables) and operations that can be performed on that data (methods).");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Object") || input.equals("object") || input.equals(""))
            {
                System.out.println("Object.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card22() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Code a programmer writes to detect and handle errors that occur during program execution");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Error-checking code") || input.equals("Error checking code") || input.equals(""))
            {
                System.out.println("Error-checking code.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card23() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A circumstance that a program was not designed to handle, " +
                "such as if the user enters a negative height.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Exception") || input.equals("exception") || input.equals(""))
            {
                System.out.println("Exception.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card24() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A _____ block surrounds normal code, which is exited immediately if a throw statement executes.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Try") || input.equals("try") || input.equals(""))
            {
                System.out.println("Try.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card25() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A __________  __________ follows all catch blocks, and executes " +
                "after the program exits the corresponding try or catch blocks");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Finally block") || input.equals("finally block") || input.equals(""))
            {
                System.out.println("Finally block.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card26() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("The _______ operator explicitly allocates an object of the specified class type.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("New") || input.equals("new") || input.equals(""))
            {
                System.out.println("New.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card27() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("The capacity of ICs doubles roughly every 18 months is known as");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Moore's Law") || input.equals("moore's law") || input.equals(""))
            {
                System.out.println("Moore's Law.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card28() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A type that has just two values: true or false.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Boolean") || input.equals("boolean") || input.equals(""))
            {
                System.out.println("Boolean.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card29() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A variable declared as type ___________ stores a floating-point number.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Double") || input.equals("double") || input.equals(""))
            {
                System.out.println("Double.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card30() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Not moving, i.e. The __________ content on the screen did not move.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Static.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card31() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A sequence of characters (literal text) that can be sent to the console window as output.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("String") || input.equals("string") || input.equals(""))
            {
                System.out.println("String.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card32() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A name given to an entity in a program, such as a class or method. The words used to name parts of a Java program");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Identifier.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card33() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A set of predefined identifiers that are reserved for particular uses.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Keyword") || input.equals("keyword") || input.equals(""))
            {
                System.out.println("Keyword.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card34() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("The basic building blocks of a program in Java");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Objects and classes.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card35() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A program written in circuitry-level language, as a series of on and off switches, is written in _______ ________.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Machine language.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card36() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("The rules of the language..");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Syntax.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card37() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A program that translates language statements into machine code.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Compiler/Interpreter");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card38() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Carrying out a statement.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Executing.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card39() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A process that frees a program of all its errors.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Debugging.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card40() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A style of programming in which sets of operations are executed one after another in sequence.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Procedural programming.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card41() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("What a procedural program does to a series of procedures to input, manipulate, and output values.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Calls.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card42() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("An existing object of a class.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Instance.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card43() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Refers to the hiding of data and methods within an object.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Encapsulation.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card44() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Describes the features of languages that allows the same word to be interpreted correctly in different situations based on the context.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Polymorphism.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card45() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Consists of programming statements that have been compiled into binary format.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Bytecode.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card46() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Sending arguments to a method.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Passing.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card47() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("An international system of character representation.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Unicode.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card48() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Any combination of nonprinting characters, such as spaces, tabs, and carriage returns (blank lines).");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Whitespace.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card49() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("A keyword used in a method header that indicates that the method does not return any value when it is called.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Void.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }

    public void card50() {
        String input;

        Boolean onCard;

        onCard = true;

        System.out.println("Created when you delete all previously compiled versions of a class before compiling again.");

        while (onCard == true) {

            input = scnr.nextLine();

            if (input.equals("Static") || input.equals("static") || input.equals(""))
            {
                System.out.println("Clean build.");

                Boolean waiting = true;

                while (waiting == true)
                {
                    input = scnr.nextLine();
                    if (input.equals("N") || input.equals("N ") || input.equals(" N")
                            || input.equals("n") || input.equals("n ") || input.equals(" n"))
                    {
                        waiting = false;
                        onCard = false;
                    }

                    else {
                        System.out.println("Invalid input.");
                    }
                }
            }

            else if (input.equals("N") || input.equals("N ") || input.equals(" N")
                    || input.equals("n") || input.equals("n ") || input.equals(" n") )  {
                onCard = false;
            }

            else if (input.equals("1"))  {
                home.mainMenu();
            }

            else {
                System.out.println("Invalid input.");
            }

        }
    }


}
