package edu.example.trainee.tasks;/*
 * Task:
 * Create a program that will ask the user about a solar system planet they want to visit.
 * And calculate the weight according to the user choose that they would have there.
 * The weight might be calculated using the following formula: weight = mass * surface gravity.
 * The "mass", "planet" should be asked from the user using Scanner class.
 * You MUST use only the different flavors of the "if" operator in this task.
 */
import java.util.Scanner;

public class WeightOnSolarSystemPlanets {
    public static void main(String[] args) {


        final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
        final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
        final double SURFACE_GRAVITY_ON_EARTH = 1.000;
        final double SURFACE_GRAVITY_ON_MOON = 0.1660;
        final double SURFACE_GRAVITY_ON_MARS = 0.3507;
        final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
        final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
        final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
        final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
        final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;


        System.out.println("Which planet do you want to visit? " + System.lineSeparator() +
                "Mercury, Venus, Earth, Moon, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto");

        Scanner str = new Scanner(System.in);
        String planet = str.nextLine().toUpperCase();

        System.out.println("What is your mass?");
        Scanner str1 = new Scanner(System.in);
        double mass = str1.nextDouble();

        if (planet.equals("MERCURY"))    {
            double weight = mass * SURFACE_GRAVITY_ON_MERCURY;
            System.out.println("You weight on Mercury " + weight);
            System.out.println();
        } else if (planet.equals("VENUS"))     {
            double weight = mass * SURFACE_GRAVITY_ON_VENUS;
            System.out.println("You weight on Venus " + weight);
            System.out.println();
        }else if(planet.equals("EARTH"))       {
            double weight = mass * SURFACE_GRAVITY_ON_EARTH;
            System.out.println("You weight on Earth " + weight);
            System.out.println();
        } else if(planet.equals("MOON"))       {
            double weight = mass * SURFACE_GRAVITY_ON_MOON;
            System.out.println("You weight on Moon " + weight);
            System.out.println();
        } else if(planet.equals("MARS"))       {
            double weight = mass * SURFACE_GRAVITY_ON_MARS;
            System.out.println("You weight on Mars " + weight);
            System.out.println();
        } else if(planet.equals("JUPITER"))    {
            double weight = mass * SURFACE_GRAVITY_ON_JUPITER;
            System.out.println("You weight on Jupiter " + weight);
            System.out.println();
        } else if(planet.equals("SATURN"))     {
            double weight = mass * SURFACE_GRAVITY_ON_SATURN;
            System.out.println("You weight on Saturn " + weight);
            System.out.println();
        } else if(planet.equals("URANUS"))     {
            double weight = mass * SURFACE_GRAVITY_ON_URANUS;
            System.out.println("You weight on Uranus " + weight);
            System.out.println();
        } else if(planet.equals("NEPTUNE"))    {
            double weight = mass * SURFACE_GRAVITY_ON_NEPTUNE;
            System.out.println("You weight on Neptune " + weight);
            System.out.println();
        } else if(planet.equals("PLUTO"))      {
            double weight = mass * SURFACE_GRAVITY_ON_PLUTO;
            System.out.println("You weight on Pluto " + weight);
            System.out.println();
        } else {
            System.out.println("You entered incorrect data");
        }
    }
}