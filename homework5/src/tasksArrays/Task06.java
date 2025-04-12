package tasksArrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Заполнить массив на 10 элементов случайными числами
 * от -10 до +10. Посчитать количество уникальных значений
 * (встречающихся в массиве один раз). Вывести на консоль
 * значения уникальных элементов и индексы, под которыми
 * они находятся в массиве.
 */
public class Task06 {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = -10;
        int[] array = new int[10];

        Task05.fillRandomArray(array, MAX, MIN, array.length);
        HashMap<Integer, Integer> uniqueNumbersMap = getUniqueNumbersMap(array);

        if (uniqueNumbersMap.isEmpty()) {
            System.out.println("Прошу простить, уникальных значений нет ");
            System.exit(0);
        }

        for (Map.Entry<Integer, Integer> entry : uniqueNumbersMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Уникальное значение (под индексом " + value + "): " + key);
        }
    }

    public static HashMap<Integer, Integer> getUniqueNumbersMap(int[] array) {
        HashMap<Integer, Integer> uniqueNumbersMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int repeats = 0;
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    repeats += 1;
                }
            }
            if (repeats == 0) {
                uniqueNumbersMap.put(array[i], i);
            }
        }
        return uniqueNumbersMap;
    }

}
