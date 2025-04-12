package tasksMethods;

import java.util.Scanner;

/**
 * В массиве хранится n явно заданных текстовых строк. Создать метод:
 * - выводящий содержимое массива в строку через пробел;
 * - сортирующий массив в обратном порядке (без учета
 * регистра) от z до a;
 * - сортирующий массив по количеству слов в строке (слова
 * разделены пробелами).
 * Программа должна вывести строки в начальном и отсортированном порядке.
 */
public class Task03 {
    public static void main(String[] args) {
        final int length = 6;
        StringSort stringSort = new StringSort();
        String[] strings = new String[]{"Nature is a temple", "in which living pillars",
                "Sometimes give voice to confused words",
                "Man passes there", "through forests of symbols",
                "Which look at him with understanding eyes"};

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Now you can either use default sequence or fill the array with random strings.
                Which option pleases you the most?
                1 - Stick with default, 2 - Test random strings""");
        int userChoice = input.nextInt();

        if (userChoice == 2) {
            for (int i = 0; i < length; i++) {
                strings[i] = stringSort.generateUniqueString();
            }
        } else if (userChoice != 1) {
            System.out.println("No such option, sticking with default");
        }

        Task02 task02 = new Task02();
        System.out.println("Initial array:");
        task02.printArray(strings);
        System.out.println("In one line:");
        System.out.println(stringSort.toSingleString(strings));
        System.out.println("Reversely sorted:");
        stringSort.reverseCaseInsensitiveSort(strings);
        task02.printArray(strings);
        System.out.println("Sorted by number of words:");
        stringSort.sortByNumOfWords(strings);
        task02.printArray(strings);
    }

}
