package tasks;

import java.util.Scanner;

/**
 * Показать битовое представление значения переменной
 * типа int, используя только один цикл, управляющую
 * переменную, вывод на консоль и битовые операции.
 */
public class Task07 {
    public static void main(String[] args) {
        System.out.println("Введите число для перевода: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        int binaryNumber = 0;
        for (int i = 1; number > 0; i *= 10) {
            if (number % 2 == 1) {
                binaryNumber += i;
            }
            number /= 2;
        }

        System.out.println("Двоичное представление числа: " + binaryNumber);
    }
}
