package tasksMethods;

import java.util.Arrays;

/**
 * Написать и протестировать перегруженный метод,
 * выводящий на экран:
 * - одномерный массив типа int;
 * - одномерный массив типа String;
 * - двухмерный массив типа int;
 * - двухмерный массив типа float.
 */
public class Task02 {
    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void printArray(float[][] array) {
        for (float[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

}
