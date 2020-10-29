import java.util.Scanner;

public class PinCode {

    /*
     * Task:
     * Complete the following program to handle attempts of entering an incorrect PIN code.
     * Дополните программу, чтобы оьработать попытки ввода неправильного PIN кода.
     */

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            String pinCode = "Q2fg35ytW4";

            System.out.println("Welcome to the most trusted bank!");
            System.out.print("Enter your PIN code: ");
            String entryCode = keyboard.nextLine();
            entryCode.equals(pinCode) ;

            // ...
            if (entryCode.equals("Q2fg35ytW4"))    {
                System.out.println("Password is correct!" );
            }
            else {
                System.out.println("Password is incorrect!");
            }
        }
    }

