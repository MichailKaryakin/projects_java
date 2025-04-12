package homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter a six-digit number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        check(number);
        happyOrNot(number);
    }

    public static void check(int number) {
        if (((number / 1_000_000) >= 1) || (number / 100_000) < 1) {
            System.out.println("Wrong format, try again");
            System.exit(0);
        }
    }

    public static void happyOrNot(int number) {
        int firstHalf = number / 1000;
        int secondHalf = number % 1000;
        int sumFirstHalf = sumOfDigits(firstHalf);
        int sumSecondHalf = sumOfDigits(secondHalf);
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("It is a happy number, whatever that means...");
        } else {
            System.out.println("It's not a happy number =(");
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        for (; number > 0; number /= 10) {
            sum += number % 10;
        }
        return sum;
    }
}
