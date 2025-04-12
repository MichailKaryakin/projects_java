package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Вывести на консоль все восьмизначные числа, цифры в
 * которых не повторяются. Эти числа должны делиться на
 * 12345, без остатка. Показать общее количество найденных
 * чисел.
 */
public class Task06 {
    public static void main(String[] args) {
        int quantity = 0;
        for (long i = 10000000; i < 100000000; i++) {
            if ((i % 12345 == 0) && digitsNotRepeat(i)) {
                System.out.println(i);
                quantity++;
            }
        }
        System.out.println("Общее количество восьмизначных чисел без повторений = " + quantity);
    }

    public static boolean digitsNotRepeat(long number) {
        List<Long> digits = digitsArrayed(number);
        Set<Long> set = new HashSet<>(digits);

        return set.size() >= digits.size();
    }

    private static List<Long> digitsArrayed(long number) {
        List<Long> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

}
