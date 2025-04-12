package tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Показать на экране все числа Армстронга в диапазоне от
 * 10 до 1 000 000.
 */
public class Task03 {
    public static void main(String[] args) {
        for (int i = 10; i <= 10_000_000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static int numOfDigits(int number) {
        int numOfDigits = 0;
        for (; number > 0; number /= 10) {
            numOfDigits++;
        }
        return numOfDigits;
    }

    private static List<Integer> digitsArrayed(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

    private static boolean isArmstrongNumber(int number) {
        int toPowerOf = numOfDigits(number);
        List<Integer> digits = digitsArrayed(number);
        int sum = 0;
        for (Integer digit : digits) {
            sum += Math.pow(digit, toPowerOf);
        }
        return sum == number;
    }

}
