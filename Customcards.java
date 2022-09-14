package com.company;

import java.util.Scanner;
import java.util.Random;

public class Customcards {
    Scanner scnr = new Scanner(System.in);

    Menuscreen menu = new Menuscreen();

    private String[] questions = new String[50];
    private String[] answers = new String[50];

    public void getCustomCards() {
        Boolean entering;
        int i;

        entering = true;

        System.out.println("Please type a question and then press Enter. Afterwards type the answer to that question and press Enter again.");
        System.out.println("After entering all questions/answers type READY/ready. You may enter up to 50 questions/answers each.");

        i = 0;

        while (entering == true) {
            questions[i] = scnr.nextLine();

            if (questions[i].equals("READY") || questions[i].equals("ready")) {
                entering = false;
                questions[i] = "";
                break;
            }

            answers[i] = scnr.nextLine();

            i += 1;
        }

        int n = i;

        i = 0;

        String starter;


        System.out.println("To begin going through flashcards press 0. Press 1 to quit.");

        while (true) {

            starter = scnr.nextLine();

            if (starter.equals("0")) {
                //waiting = false;

                System.out.println("Press Enter to flip a card. Enter 'N' or 'n' to go to the next card.");

                for (i = 0; i < n; i++) {

                    String mover;

                    Boolean waitingAnswer = true;

                    System.out.println(questions[i]);

                    while (waitingAnswer) {

                        mover = scnr.nextLine();

                        if (mover.equals("")) {
                            System.out.println(answers[i]);

                            mover = scnr.nextLine();

                            if (mover.equals("n") || mover.equals("N")) {
                                waitingAnswer = false;
                            }

                        }

                        else if (mover.equals("n") || mover.equals("N")) {
                            waitingAnswer = false;
                        }

                        else {
                            System.out.println("Invalid input");
                        }

                    }




                }

                menu.mainMenu();
                break;
            }

            else if (starter.equals("1")) {
                //waiting = false;
                menu.mainMenu();
                break;
            }

            else {
                System.out.println("");
            }

        }



    }


}
