package tasksInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array implements IShow, IMath, ISort {
    Integer[] array;

    private void arrayRandomizer() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 500);
        }
    }

    public Array(int arrayLength) {
        array = new Integer[arrayLength];
        arrayRandomizer();
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void print(String info) {
        System.out.println(info);
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int max() {
        double max = Double.NEGATIVE_INFINITY;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return (int) max;
    }

    @Override
    public int min() {
        double min = Double.POSITIVE_INFINITY;
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return (int) min;
    }

    @Override
    public float avg() {
        int sum = 0;
        int counter = 0;
        for (int number : array) {
            sum += number;
            counter++;
        }
        return (float) (sum / counter);
    }

    @Override
    public void sortAsc() {
        Arrays.sort(array);
    }

    @Override
    public void sortDesc() {
        Arrays.sort(array, Comparator.reverseOrder());
    }

}
