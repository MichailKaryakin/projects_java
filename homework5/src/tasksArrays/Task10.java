package tasksArrays;

import java.util.Scanner;

/**
 * Заполнить массив размерности n случайными цифрами от 0 до 33.
 * Найти элемент массива, который делится без остатка на значение
 * элемента слева и значение элемента справа. Вывести на консоль
 * значения исходного массива. Вывести индекс найденного элемента,
 * если такой не найден, вывести -1. n – задается с клавиатуры.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = input.nextInt();
        input.close();

        int[] array = new int[arraySize];
        Task05.fillRandomArray(array, 33, 0, array.length);
        System.out.println("Исходный массив: ");
        Task09.printArray(array);

        if (!checkForSpecifics(array)) {
            System.out.println();
            System.out.println("-1");
        }
    }

    public static boolean checkForSpecifics(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if ((array[i] % array[i - 1] == 0) && (array[i] % array[i + 1] == 0)) {
                System.out.println("Элемент найден, индекс: " + i);
                return true;
            }
        }
        return false;
    }
}
