package tasksArrays;

import java.util.Scanner;

/**
 * Заполнить массив размерности n случайными цифрами
 * от –2 до n. Если в массиве есть хотя бы одно отрицательное
 * значение меньше -1, заменить все отрицательные значение
 * в массиве на квадрат (в степени 2) этих значений. Вывести
 * исходный и результирующий массив на консоль.
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = input.nextInt();
        input.close();

        int[] array = new int[arraySize];
        Task05.fillRandomArray(array, arraySize, -2, array.length);

        System.out.println("Вывод первоначального массива: ");
        printArray(array);
        getResultingArray(array);
        System.out.println("Вывод результирующего массива: ");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int range : array) {
            System.out.println(range);
        }
    }

    public static void getResultingArray(int[] array) {
        int givenValue = -1;
        for (int range : array) {
            if (range < givenValue) {
                reworkArray(array);
                break;
            }
        }
    }

    public static void reworkArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = (int) Math.pow(array[i], 2);
            }
        }
    }

}
