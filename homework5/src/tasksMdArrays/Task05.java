package tasksMdArrays;

import java.util.Arrays;

/**
 * Создать массив из 20 случайных чисел в диапазоне от -10
 * до 20. Определить максимальное количество подряд идущих
 * положительных элементов, не прерываемых ни нулями,
 * ни отрицательными числами. Вывести на консоль исходный
 * массив и найденный фрагмент.
 */
public class Task05 {
    private static final int ARRAY_LENGTH = 20;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        Task02.arrayRandomizer(array, -10, 21);
        int[] fragment = getFragment(array);

        System.out.println("Исходный массив:");
        Task04.printArray(array);
        System.out.println("Найденный фрагмент:");
        Task04.printArray(fragment);
    }

    public static int[] getFragment(int[] array) {
        int streakLength = 0;
        int maxStreakLength = 0;
        int indexOfStreak = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                streakLength++;
            } else {
                if (streakLength > maxStreakLength) {
                    maxStreakLength = streakLength;
                    indexOfStreak = i - streakLength;
                }
                streakLength = 0;
            }
        }

        return Arrays.copyOfRange(array, indexOfStreak, indexOfStreak + maxStreakLength);
    }

}
