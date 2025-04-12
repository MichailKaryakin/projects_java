package tasksRecursion;

/**
 * Дано натуральное число N. Выведите все его цифры по
 * одной, в обычном порядке, разделяя их пробелами или новыми
 * строками. При решении этой задачи нельзя использовать
 * строки, списки, массивы, циклы. Разрешена только рекурсия
 * и целочисленная арифметика.
 */
public class Task05 {
    private static final int N = 1459;

    public static void main(String[] args) {
        printHeadDigits(N);
    }

    public static void printHeadDigits(int number) {
        if (number != 0) {
            printHeadDigits(number / 10);
            System.out.print(number % 10);
            if (number != N) {
                System.out.print(" ");
            }
        }
    }

}
