package tasksRecursion;

/**
 * Дано натуральное число N. Вычислите сумму его цифр.
 */
public class Task03 {
    public static void main(String[] args) {
        final int N = 1459;
        System.out.println(sumOfDigits(N));
    }

    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10 + sumOfDigits(number / 10));
        }
    }

}
