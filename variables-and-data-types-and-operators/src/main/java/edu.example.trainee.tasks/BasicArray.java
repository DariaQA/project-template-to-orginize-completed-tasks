import java.util.Random;

/**
     * Task:
     * Create a program that will print a table 100 x 100 size of random numbers.
     * Use a two dimensions array to store numbers and the "for loop" to output them.
     *
     * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
     * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
     */


    public class BasicArray {

        public static void main(String[] args) {
            Random random = new Random();

            // initializes and fills two dimensional array
            int[][] number = new int[100][100];
            for (int i = 0; i < number.length; i++) {
                for (int j = 0; j < number.length; j++) {
                    number[i][j] = random.nextInt(100);
                }
            }

            for (int i = 0; i < 100; i++) {
                for (int numberOfDashes = 0; numberOfDashes < 400; numberOfDashes++) { // prints rows of dashes before printing columns
                    System.out.print("-");
                    if (numberOfDashes == 399) {
                        System.out.println(); // goes to next line to print columns
                    }
                }
                for (int j = 0; j < 100; j++) {
                    System.out.printf("|%-3d", number[i][j]);
                    if (j == 99) {
                        System.out.println("|");
                    }
                }
                if (i == 99) { // prints the last row of dashes
                    for (int numberOfDashes = 0; numberOfDashes < 400; numberOfDashes++) {
                        System.out.print("-");
                    }
                }
            }
        }
    }




