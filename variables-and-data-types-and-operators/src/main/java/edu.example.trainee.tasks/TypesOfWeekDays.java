package edu.example.trainee.tasks;

import java.time.MonthDay;
import java.util.Scanner;

/**
     * Task:
     * Create a program that output the type of a week day according to its number.
     * The number of the week day the user should be able to specify in the input.
     * Use Scanner class to read input stream from the keyboard.
     * Your solution MUST include the usage of the "switch" operator.
     * Try to use "case" branches in the most effective way.
     * Assume for this task that there are only 2 type: working and weekend days.
     */
 public class TypesOfWeekDays {
        public static void main(String[] args) {
            // your code here


            String dayOfWeek;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Specify the desired day of the week: ");
                    dayOfWeek = scanner.nextLine();
                    switch(dayOfWeek){
                        case "Monday" -> System.out.println("It's a working day: " + dayOfWeek);
                        case "Tuesday" -> System.out.println("It's a working day: " + dayOfWeek);
                        case "Wednesday" -> System.out.println("It's a working day: " + dayOfWeek );
                        case "Thursday" -> System.out.println("It's a working day: " + dayOfWeek );
                        case "Friday" -> System.out.println("It's a working day: " + dayOfWeek);
                        case "Saturday" -> System.out.println("It's a day of relaxation and fun: " + dayOfWeek );
                        case "Sunday" -> System.out.println("It's a day of relaxation and fun: " + dayOfWeek );

                        default -> System.out.println("There is no such day (((");
                    }
        }
    }

