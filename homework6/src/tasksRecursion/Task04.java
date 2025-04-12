package tasksRecursion;

/**
 * Дано натуральное число N. Выведите все его цифры по
 * одной, в обратном порядке, разделяя их пробелами. Разрешена
 * только рекурсия и целочисленная арифметика.
 */
public class Task04 {
    public static void main(String[] args) {
        final int N = 1459;
        printTailDigits(N);
    }

    public static void printTailDigits(int number) {
        if (number / 10 == 0) {
            System.out.print(number);
        } else if (number != 0) {
            System.out.print(number % 10 + " ");
            printTailDigits(number / 10);
        }
    }

}
