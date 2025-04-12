package homework;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input three digit number");
        int n = scanner.nextInt();

        scanner.close();

        int firstDigit, secondDigit, thirdDigit;

        firstDigit = n % 10;
        n = n / 10;

        secondDigit = n % 10;
        n = n / 10;

        thirdDigit = n % 10;
        n = n / 10;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        System.out.printf("Sum of digits: %d", sumOfDigits);
    }

}
