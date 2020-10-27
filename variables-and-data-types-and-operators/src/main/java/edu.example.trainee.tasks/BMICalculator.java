import java.util.Scanner;


public class BMICalculator {
    public static void main(String[] args){


        System.out.println("Hello, let's find out your body mass index)))" );
        System.out.println();
        System.out.println("Let's start with your weight, indicate how many kilograms do you weigh?)))" );

        Scanner str = new Scanner(System.in);
        double kg = str.nextDouble();

        System.out.println("What is your height?");
        double m = str.nextDouble();

        double BMI = kg / (m*m);


        System.out.println("------------------------ ");

        System.out.println("Your BMI is " + BMI );

    }
}
