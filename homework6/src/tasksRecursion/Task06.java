package tasksRecursion;

import java.util.Scanner;

/**
 * С клавиатуры вводится число n, десятичная запись которого
 * не содержит нулей. Получите число, записанное теми
 * же цифрами, но в противоположном порядке. При решении
 * этой задачи разрешается только рекурсия и целочисленная
 * арифметика. Метод должен возвращать целое число, являющееся
 * результатом работы программы, выводить число по одной цифре нельзя.
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = input.nextInt();
        int numberReverse = reverseInt(number);
        System.out.println("Развёрнутое число: " + numberReverse);
    }

    private static int reverseInt(int number) {
        if (number < 10) {
            return number;
        }
        int remainder = number % 10;
        int reversedNumber = reverseInt(number / 10);
        int numberOfDigits = (int) Math.log10(number) + 1;
        return remainder * (int) Math.pow(10, numberOfDigits - 1) + reversedNumber;
    }

}
