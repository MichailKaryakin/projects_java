package tasksArrays;

import java.util.Random;
import java.util.Scanner;

/**
 * Заполнить массив размерности n словами, состоящими
 * только из строчных латинских букв. Слова между собой разделены
 * пробелами, количество пробелов случайное – от 1 до 5.
 * Подсчитать общее количество слов в массиве. n – задается с клавиатуры.
 */
public class Task11 {
    public static int wordsTotal = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int arraySize = input.nextInt();
        input.close();
        System.out.println();

        String[] array = new String[arraySize];
        fillWithWords(array);
        System.out.println("Заполненный массив: ");
        printTheStringArray(array);
    }

    public static void fillWithWords(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int wordsOnString = generateRandomInt() * 2;
            array[i] = buildTheString(wordsOnString);
        }
    }

    public static int generateRandomInt() {
        Random randomizer = new Random();
        return randomizer.nextInt(5) + 1;
    }

    public static char generateRandomChar() {
        Random randomizer = new Random();
        int value = randomizer.nextInt(0x007A - 0x0061 + 1) + 0x0061;
        return (char) value;
    }

    public static String buildTheString(int numOfWords) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numOfWords; i++) {
            for (int j = 0; j < (generateRandomInt() * 2); j++) {
                stringBuilder.append(generateRandomChar());
            }
            wordsTotal++;
            if ((i + 1) != numOfWords) {
                stringBuilder.append(" ".repeat(Math.max(0, generateRandomInt())));
            }
        }
        return stringBuilder.toString();
    }

    public static void printTheStringArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Всего слов в массиве: " + wordsTotal);
    }

}
