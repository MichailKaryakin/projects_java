package tasksArrays;

import java.util.Random;

/**
 * Заполнить массив на 30 элементов случайными числами
 * от -70 до +50. Найти минимальный элемент и вывести его
 * на консоль. Найти максимальный элемент и вывести его на
 * консоль.
 */
public class Task02 {
    public static void main(String[] args) {
        final int MIN = -70;
        final int MAX = 50;
        int[] randomArray = new int[30];
        fillRandomArray(randomArray, MAX, MIN, randomArray.length);
        findMinElement(randomArray);
        findMaxElement(randomArray);
    }

    public static void fillRandomArray(int[] array, int max, int min, int range) {
        Random randomizer = new Random();
        for (int i = 0; i < range; i++) {
            array[i] = randomizer.nextInt(max - min + 1) + min;
        }
    }

    public static void findMinElement(int[] array) {
        int temp = 100;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                temp = array[i];
                index = i;
            }
        }
        System.out.println("Минимальный элемент массива (индекс " + index + "): " + temp);
    }

    public static void findMaxElement(int[] array) {
        int temp = -100;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                temp = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент массива (индекс " + index + "): " + temp);
    }

}
