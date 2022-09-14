package com.company;

import java.util.Scanner;

public class Listofcards {
    Scanner scnr = new Scanner(System.in);

    private Beginscreen backtobegin;

    public void listCards() {

        String viewer;
        Boolean waiting;

        waiting = true;

        backtobegin = new Beginscreen();

        while(waiting) {

            System.out.println("Press 0 to view all cards and answers. Press 1 to return to Menu.");

            viewer = scnr.next();

            if (viewer.equals("0")) {
                System.out.println("A sequence of instructions that solves a problem is called an \n" +
                        "Algorithm.\n" +
                        "\n" +
                        "In an array, each element's location number is called the\n" +
                        "Index.\n" +
                        "\n" +
                        "A program that translates language statements into machine code.\n" +
                        "Compiler/Interpreter\n" +
                        "\n" +
                        "A method input specified in a method definition.\n" +
                        "Argument.\n" +
                        "\n" +
                        "Text in code that is meant to be read by the programmer but is ignored by the compiler.\n" +
                        "Comments.\n" +
                        "\n" +
                        "Refers to the hiding of data and methods within an object.\n" +
                        "Encapsulation.\n" +
                        "\n" +
                        "This keyword is used to define a constant variable\n" +
                        "Final.\n" +
                        "\n" +
                        "When a program gets data, perhaps from a file, keyboard, touchscreen, network, etc \n" +
                        "Input.\n" +
                        "\n" +
                        "Increasing a variable's value by 1, as in x = x + 1, is common, and known as\n" +
                        "Incrementing.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "A named list of statements.\n" +
                        "Method.\n" +
                        "\n" +
                        "The _______ operator explicitly allocates an object of the specified class type.\n" +
                        "New.\n" +
                        "\n" +
                        "A _____ block surrounds normal code, which is exited immediately if a throw statement executes.\n" +
                        "Try.\n" +
                        "\n" +
                        "When a program performs computations on that data, such as adding two values like x + y.\n" +
                        "Process.\n" +
                        "\n" +
                        "A variable declared as type ___________ stores a floating-point number.\n" +
                        "Double.\n" +
                        "\n" +
                        "To violate a programming language's rules on how symbols can be combined to create a program\n" +
                        "Syntax error.\n" +
                        "\n" +
                        "Created when you delete all previously compiled versions of a class before compiling again.\n" +
                        "Clean build.\n" +
                        "\n" +
                        "Consists of programming statements that have been compiled into binary format.\n" +
                        "Bytecode.\n" +
                        "\n" +
                        "A circumstance that a program was not designed to handle, such as if the user enters a negative height.\n" +
                        "Exception.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Each item in an array is known as an\n" +
                        "Element.\n" +
                        "\n" +
                        "Not moving, i.e. The __________ content on the screen did not move.\n" +
                        "Static.\n" +
                        "\n" +
                        "The capacity of ICs doubles roughly every 18 months is known as\n" +
                        "Moore's Law.\n" +
                        "\n" +
                        "A __________  __________ follows all catch blocks, and executes after the program exits the corresponding try or catch blocks\n" +
                        "Finally block.\n" +
                        "\n" +
                        "Any individual item or combination of items, like variables, literals, operators, and parenthesis that evaluates to a value, like 2 * (x + 1).\n" +
                        "Expression.\n" +
                        "\n" +
                        "The rules of the language..\n" +
                        "Syntax.\n" +
                        "\n" +
                        "Code a programmer writes to detect and handle errors that occur during program execution\n" +
                        "Error-checking code.\n" +
                        "\n" +
                        "A named item used to hold a value.\n" +
                        "Variable.\n" +
                        "\n" +
                        "A keyword used in a method header that indicates that the method does not return any value when it is called.\n" +
                        "Void.\n" +
                        "\n" +
                        "Carrying out a statement.\n" +
                        "Executing.\n" +
                        "\n" +
                        "A sequence of characters (literal text) that can be sent to the console window as output.\n" +
                        "String.\n" +
                        "\n" +
                        "An existing object of a class.\n" +
                        "Instance.\n" +
                        "\n" +
                        "A name given to an entity in a program, such as a class or method. The words used to name parts of a Java program\n" +
                        "Identifier.\n" +
                        "\n" +
                        "When a program puts data somewhere, such as to a file, screen, network, etc.\n" +
                        "Output.\n" +
                        "\n" +
                        "Each execution of the loop body is called an\n" +
                        "Iteration.\n" +
                        "\n" +
                        "Sending arguments to a method.\n" +
                        "Passing.\n" +
                        "\n" +
                        "A special variable having one name, but storing a list of data items, with each item being directly accessible.\n" +
                        "Array.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "A program written in circuitry-level language, as a series of on and off switches, is written in _______ _______.\n" +
                        "Machine language.\n" +
                        "\n" +
                        "A process that frees a program of all its errors.\n" +
                        "Debugging.\n" +
                        "\n" +
                        "Describes the features of languages that allows the same word to be interpreted correctly in different situations based on the context.\n" +
                        "Polymorphism.\n" +
                        "\n" +
                        "An international system of character representation.\n" +
                        "Unicode.\n" +
                        "\n" +
                        "What a procedural program does to a series of procedures to input, manipulate, and output values.\n" +
                        "Calls.\n" +
                        "\n" +
                        "The basic building blocks of a program in Java\n" +
                        "Objects and classes.\n" +
                        "\n" +
                        "Occurs when a program compiles successfully but does not function correctly.\n" +
                        "Logic error.\n" +
                        "\n" +
                        "A grouping of data (variables) and operations that can be performed on that data (methods).\n" +
                        "Object.\n" +
                        "\n" +
                        "A sequence of statements only executed under a certain condition\n" +
                        "Branch.\n" +
                        "\n" +
                        "A type that has just two values: true or false.\n" +
                        "Boolean.\n" +
                        "\n" +
                        "Any combination of nonprinting characters, such as spaces, tabs, and carriage returns (blank lines).\n" +
                        "Whitespace.\n" +
                        "\n" +
                        "A program construct that repeatedly executes statements.\n" +
                        "Loop.\n" +
                        "\n" +
                        "A style of programming in which sets of operations are executed one after another in sequence.\n" +
                        "Procedural programming.\n" +
                        "\n" +
                        "A ______ loop is a loop with three parts at the top: a loop variable initialization, a loop expression, and a loop variable update.\n" +
                        "For.\n" +
                        "\n" +
                        "A set of predefined identifiers that are reserved for particular uses.\n" +
                        "Keyword.\n" +
                        "\n");

                waiting = false;
                backtobegin.startCards();
            }

            else if (viewer.equals("1")) {
                waiting = false;
                backtobegin.startCards();
            }

            else {
                System.out.println("Invalid input.");
            }


        }



    }




}
