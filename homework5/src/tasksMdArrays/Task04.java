package tasksMdArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать массив из 100 случайных чисел в диапазоне от
 * - 300 до 555. Написать программу, копирующую один массив
 * в другой следующим образом: сначала копируются последовательно
 * все элементы, большие 0, затем последовательно
 * все элементы, равные 0, а затем последовательно все элементы,
 * меньшие 0. Вывести исходный массив. Вывести результирующий массив.
 */
public class Task04 {
    private static final int ARRAY_LENGTH = 100;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        Task02.arrayRandomizer(array, -300, 556);
        int[] newArray = formNewArray(array);

        System.out.println("Исходный массив:");
        printArray(array);
        System.out.println("Результирующий массив:");
        printArray(newArray);
    }

    public static int[] formNewArray(int[] array) {
        List<Integer> listNegative = new ArrayList<>();
        List<Integer> listZero = new ArrayList<>();
        List<Integer> listPositive = new ArrayList<>();
        for (int j : array) {
            if (j < 0) {
                listNegative.add(j);
            } else if (j == 0) {
                listZero.add(j);
            } else {
                listPositive.add(j);
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(listNegative);
        result.addAll(listZero);
        result.addAll(listPositive);
        return result.stream().mapToInt(i->i).toArray();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            boolean conditionOne = (i < array.length - 1);
            boolean conditionTwo = (((i + 1) % 20) == 0);
            if (conditionOne && !conditionTwo) System.out.print(" ");
            if (conditionTwo) System.out.println();
        }
        System.out.println();
    }

}
