package edu.example.trainee.tasks;

import java.util.Scanner;
import java.util.Random;

public class PositiveNegativeNumber {
    /**
     * Task:
     * Generate a random integer number, output it, then specify whether it negative or positive.
     * You MUST use "ternary" operator.
     */


    public static void main(String[] args) {

        System.out.println("Cлучайное число № 1: " + Math.random());
        System.out.println("Случайное число № 2: " + Math.random());


        if (Math.random() <= 0) System.out.println("Negative");

        else if (Math.random() >= 0) System.out.println("Positive");

    }

    }







