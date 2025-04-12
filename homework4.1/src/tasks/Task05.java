package tasks;

import java.util.Scanner;

/**
 * Напишите программу, которая будет проверять, является
 * ли число, введенное с клавиатуры палиндромом (одинаково
 * читающимся в обоих направлениях).
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для проверки на палиндром: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int numOfDigits(int number) {
        int numOfDigits = 0;
        while (number > 0) {
            numOfDigits++;
            number /= 10;
        }
        return numOfDigits;
    }

    public static boolean isPalindrome(int number) {
        for (int i = 1, j = numOfDigits(number); i < j; i++, j--) {
            int digitPosIth = (number % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);
            int digitPosJth = (number / (int) Math.pow(10, j - 1)) % 10;
            if (digitPosIth != digitPosJth) {
                return false;
            }
        }
        return true;
    }

}
