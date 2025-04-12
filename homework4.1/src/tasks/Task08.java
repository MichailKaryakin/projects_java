package tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Электронные часы показывают время в формате от 00:00
 * до 23:59. Написать программу, которая выведет на консоль
 * сколько раз за сутки случается так, что слева от двоеточия
 * показывается симметричная комбинация для той, что справа
 * от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
 * на экран все симметричные комбинации. Вывести общее
 * число комбинаций.
 */
public class Task08 {
    public static void main(String[] args) {
        int quantity = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                List<Integer> hours = new ArrayList<>();
                List<Integer> minutes = new ArrayList<>();
                if (i < 10) {
                    hours.add(0);
                    hours.add(i);
                } else {
                    hours.add(i / 10);
                    hours.add(i % 10);
                }
                if (j < 10) {
                    minutes.add(0);
                    minutes.add(j);
                } else {
                    minutes.add(j / 10);
                    minutes.add(j % 10);
                }
                if (hours.equals(minutes.reversed())) {
                    hours.forEach(System.out::print);
                    System.out.print(":");
                    minutes.forEach(System.out::print);
                    System.out.println();
                    quantity++;
                }
            }
        }

        System.out.println("Общее количество симметричных сочитаний = " + quantity);
    }

}
