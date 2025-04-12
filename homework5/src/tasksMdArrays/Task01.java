package tasksMdArrays;

import java.util.Arrays;

/**
 * Сформировать массив, элементами которого будут квадраты
 * соответствующих индексов. Вывести результат на экран.
 */
public class Task01 {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int[] testArray = arrayOfSquareIndexes(ARRAY_LENGTH);
        printArray(testArray);
    }

    public static int[] arrayOfSquareIndexes(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) Math.pow(i, 2);
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
