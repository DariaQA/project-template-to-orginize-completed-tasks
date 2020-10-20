package edu.example.trainee.tasks;

public class ScopeOfLocalVariables {
    public static void main(String[] args) {
        {
            int intValue = 97;
            // declare more variables of any types here
            {
                // declare another variable of any type here
                Long longValue = 123456789L;
                System.out.println("Hello"+ longValue);
                // try to output all the earlier declared variables
                System.out.println("Let's try to use 'intValue' variable.");
                System.out.println("We can do it: " + intValue);
                System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");


                {
                    // and declare two or more variable here as well
                    char charValue = 'B';

                    byte byteValue1 = 2;
                    byte byteValue = 9;
                    int x = byteValue + byteValue1;

                    System.out.println( "Old: " + x );

                    // try to output all the earlier declared variables
                    System.out.println( "Old: " + x );
                    System.out.println("intValue: " + intValue);
                    System.out.println("charValue: " + charValue);
                }
                // try to output all the earlier declared variables
                System.out.println("intValue: " + intValue);
                // We cannot use it here. Why?
                // difference types variable
                System.out.println("charValue: " + intValue);
            }
        }
        {
            // We cannot use it here. Why?
            // Not variable declaration
            int intValue = 5000;
            System.out.println("intValue: " + intValue);
        }
    }
}

