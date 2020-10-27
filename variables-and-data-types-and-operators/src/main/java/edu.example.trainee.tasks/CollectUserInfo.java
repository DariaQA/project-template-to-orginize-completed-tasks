package edu.example.trainee.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectUserInfo {
    /*
     * Task:
     * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
     * You can use as an example from the ScannerUsageExample class.
     * You must use the most appropriate type for each variable and not just Strings for everything.
     * Do be shy to check other info out in the internet.
     */

        public static void main(String[] args) {
            // Declare the object of the Scanner class and use System.in as an input stream
            Scanner scanner = new Scanner(System.in);

            // Declare variables of all the possible primitive types
            boolean Work;
            float start;
            short hourswork;
            boolean works;
            long taxId;
            float salary;



                System.out.println("Hi, how are you? I have some questions about you.");
                System.out.println("Do you work? (true, false): ");
                Work = scanner.nextBoolean();

                System.out.println("What time do you start your working day?(6 - 23): ");
                start = scanner.nextFloat();

                System.out.println("How many hours do you work per day (0 - 24): ");
                hourswork = scanner.nextShort();

                System.out.println("Are you satisfied with your job? (true, false): ");
                works = scanner.nextBoolean();

                System.out.println("What is your tax ID? (0 - " + Long.MAX_VALUE + "): ");
                taxId = scanner.nextLong();

                System.out.println("How satisfied are you with your salary? (1 - 100): ");
                salary = scanner.nextFloat();


                System.out.println("-----------------------");
                System.out.println("Your info:");

                System.out.println("Work: " + Work);
                System.out.println("Schedule: " + start);
                System.out.println("Work time: " + hourswork);
                System.out.println("Attitude to work: " + works);
                System.out.println("Tax ID: " + taxId);
                System.out.println("Satisfied with salary: " + salary);
            System.out.println("Thank you for your time !");

        }
    }


