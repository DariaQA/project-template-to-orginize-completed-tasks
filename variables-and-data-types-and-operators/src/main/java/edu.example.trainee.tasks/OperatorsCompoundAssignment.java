//package edu.example.trainee.tasks;

public class OperatorsCompoundAssignment {
    
    public static void main(String[] args) {
        int totalResult = 20;
        System.out.println("Variant 1");

        totalResult += totalResult + 30;
        System.out.println("1 Total result: " + totalResult);

        totalResult -= totalResult - 43;
        System.out.println("2 Total result: " + totalResult);

        totalResult *= totalResult * 4;
        System.out.println("3 Total result: " + totalResult);

        totalResult /= totalResult / 8;
        System.out.println("4 Total result: " + totalResult);

        totalResult %= totalResult % 7;
        System.out.println("5 Total result: " + totalResult);

        totalResult >>= totalResult >> 1;
        System.out.println("6 Total result: " + totalResult);

        totalResult <<= totalResult << 1;
        System.out.println("7 Total result: " + totalResult);

        totalResult &= totalResult & 59;
        System.out.println("8 Total result: " + totalResult);

        totalResult ^= totalResult ^ 100;
        System.out.println("9 Total result: " + totalResult);

        totalResult |= totalResult | 177;
        System.out.println("10 Total result: " + totalResult);

        System.out.println("Variant 2");

        totalResult += 30;
        System.out.println("1 Total result: " + totalResult);

        totalResult -= 43;
        System.out.println("2 Total result: " + totalResult);

        totalResult *= 4;
        System.out.println("3 Total result: " + totalResult);

        totalResult /= 8;
        System.out.println("4 Total result: " + totalResult);

        totalResult %= 7;
        System.out.println("5 Total result: " + totalResult);

        totalResult >>= 1;
        System.out.println("6 Total result: " + totalResult);

        totalResult <<= 1;
        System.out.println("7 Total result: " + totalResult);

        totalResult &= 59;
        System.out.println("8 Total result: " + totalResult);

        totalResult ^= 100;
        System.out.println("9 Total result: " + totalResult);

        totalResult |= 177;
        System.out.println("10 Total result: " + totalResult);

    }
}

