package tasksArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Заполнить массив на 10 элементов случайными числами
 * от -10 до +10. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы и количество повторений.
 */
public class Task05 {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = -10;
        int[] array = new int[10];
        fillRandomArray(array, MAX, MIN, array.length);
        dealWithDuplicates(array);
    }

    public static void fillRandomArray(int[] array, int max, int min, int range) {
        Random randomizer = new Random();
        for (int i = 0; i < range; i++) {
            array[i] = randomizer.nextInt(max - min + 1) + min;
        }
    }

    public static void dealWithDuplicates(int[] array) {
        HashMap<Integer, Integer> duplicatesMap = getDuplicatesMap(array);
        boolean presentAtAll = false;
        for (Map.Entry<Integer, Integer> entry : duplicatesMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > 0) {
                System.out.println("Повторяющиеся значение (повторяется раз: " + value + "): " + key);
                presentAtAll = true;
            }
        }
        if (!presentAtAll) {
            System.out.println("Дубликатов нет, нижайшие извинения ");
        }
    }

    public static HashMap<Integer, Integer> getDuplicatesMap(int[] array) {
        HashMap<Integer, Integer> duplicatesMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (duplicatesMap.containsKey(i)) {
                continue;
            }
            int repeats = 0;
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    repeats += 1;
                }
            }
            duplicatesMap.put(array[i], repeats);
        }
        return duplicatesMap;
    }

}
