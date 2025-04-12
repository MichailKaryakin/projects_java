package tasksArrays;

import java.util.*;

/**
 * Заполнить массив размерности n случайными строчными
 * латинскими буквами. Подсчитать, сколько раз встречается
 * каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 */
public class Task08 {
    public static void main(String[] args) {
        final int MAX = 0x007A;
        final int MIN = 0x0061;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = input.nextInt();
        input.close();

        char[] array = new char[arraySize];
        fillRandomCharArray(array, MAX, MIN, array.length);
        printRepeatedLetters(array, 3);
    }

    public static void fillRandomCharArray(char[] array, int max, int min, int range) {
        Random randomizer = new Random();
        for (int i = 0; i < range; i++) {
            int value = randomizer.nextInt(max - min + 1) + min;
            array[i] = (char) value;
        }
    }

    public static void printRepeatedLetters(char[] array, int numOfRepeats) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (charSet.contains(array[i])) {
                continue;
            }
            int repeats = 0;
            for (int j = 0; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    repeats += 1;
                }
            }
            if (repeats > numOfRepeats) {
                System.out.println(array[i]);
                charSet.add(array[i]);
            }
        }
    }

}
