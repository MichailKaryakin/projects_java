package tasks;

/**
 * Напишите программу, которая выводит на экран числа
 * от 1 до 1 000. При этом вместо чисел, кратных трём,
 * программа должна выводить слово fizz, а вместо чисел,
 * кратных пяти – слово buzz. Если число кратно пятнадцати,
 * то программа должна выводить вместо числа слово hiss.
 */
public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (i % 15 == 0) {
                System.out.println("hiss");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
