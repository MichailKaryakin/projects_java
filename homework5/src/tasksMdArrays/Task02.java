package tasksMdArrays;

import java.util.Random;

/**
 * Создать массив из 20 случайных чисел в диапазоне от
 * -10 до 30. Написать программу, определяющую сумму элементов
 * массива, находящихся в массиве после первого отрицательного
 * элемента (первый отрицательный элемент не должен
 * входить в сумму). Вывести на консоль полученный
 * массив и сумму.
 */
public class Task02 {
    private static final int ARRAY_LENGTH = 20;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        arrayRandomizer(array, -10, 31);
        Task01.printArray(array);
        int sum = negativeFollowingSum(array);
        System.out.println("Сумма элементов, следующих за первым отрицательным = " + sum);
    }

    public static void arrayRandomizer(int[] array, int origin, int bound) {
        for (int i = 0; i < array.length; i++) {
            Random randomizer = new Random();
            array[i] = randomizer.nextInt(origin, bound);
        }
    }

    public static int negativeFollowingSum(int[] array) {
        int sum = 0;
        int occurred = 0;
        for (int j : array) {
            sum += j * occurred;
            if (j < 0 && occurred == 0) {
                occurred = 1;
            }
        }
        return sum;
    }

}
