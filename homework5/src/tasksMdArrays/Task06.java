package tasksMdArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать квадратный массив размерности n заполненный
 * случайными числами, вывести массив на экран в виде
 * таблицы, найти наименьший и наибольший элемент массива
 * и вывести их на экран (если найдено несколько одинаковых
 * элементов – вывести индексы строки и столбца, где есть
 * повторения). Вывести на экран время выполнения поиска, в
 * миллисекундах. Размерность массива должна задаваться с
 * клавиатуры.
 */
public class Task06 {
    private static final int ORIGIN = 100;
    private static final int BOUND = 110;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размерность квадратного массива: ");
        int size = input.nextInt();
        input.close();

        int[][] matrix = new int[size][size];
        matrixRandomizer(matrix);
        System.out.println("Заполненный массив: ");
        printMatrix(matrix);
        System.out.println("Время выполнения поиска (в мс.) = " + findMinMax(matrix));
    }

    public static void matrixRandomizer(int[][] matrix) {
        Random randomizer = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(ORIGIN, BOUND);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static long findMinMax(int[][] matrix) {
        long startTime = System.currentTimeMillis();

        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println("Минимальный элемент = " + (int) min + "\nМаксимальный элемент = " + (int) max);
        searchExtraOccurrences(matrix, (int) min, (int) max);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void searchExtraOccurrences(int[][] matrix, int first, int second) {
        int firstRepeats = 0;
        int secondRepeats = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == first) {
                    if (firstRepeats > 0) {
                        System.out.println("Повторное вхождение минимума (строка, столбец): " + i + ", " + j);
                    }
                    firstRepeats++;
                } else if (matrix[i][j] == second) {
                    if (secondRepeats > 0) {
                        System.out.println("Повторное вхождение максимума (строка, столбец): " + i + ", " + j);
                    }
                    secondRepeats++;
                }
            }
        }
    }

}
