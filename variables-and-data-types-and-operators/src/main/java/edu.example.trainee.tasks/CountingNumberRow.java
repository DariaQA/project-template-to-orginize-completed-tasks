import java.util.Scanner;

public class CountingNumberRow {


    /*
     * Task:
     * Write a program that gets an integer from the user.
     * Then print from 0 to that number.
     * In this task use "for loop" to complete it.
     * For example:
     * Your number: 6
     * Counting number row: 0, 1, 2, 3, 4, 5, 6
     *
     * Напишите программу, которая получает целое число от пользователя.
     * Потом печатать от 0 до этого числа.
     * В этом задании используйте "for loop", чтобы выполнить его.
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Your number: " + number);
            System.out.print ( "Counting number row: ");

            for (int i = 0; i <= number; i++){
                System.out.print ( i + " ");
            }
        }
    }

