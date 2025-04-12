package tasksArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая цифра.
 * Вывести результат на экран. n – задается с клавиатуры.
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = input.nextInt();
        input.close();

        int[] array = new int[arraySize];
        Task05.fillRandomArray(array, 13, 3, array.length);
        HashMap<Integer, Integer> duplicatesMap = Task05.getDuplicatesMap(array);

        for (Map.Entry<Integer, Integer> entry : duplicatesMap.entrySet()) {
            Integer key = entry.getKey();
            int value = entry.getValue() + 1;
            if (value > 0) {
                System.out.println("Цифра " + key + " встречается раз: " + value);
            }
        }
    }

}
