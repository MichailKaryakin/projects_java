package tasks;

/**
 * Показать на экране все совершенные числа в диапазоне от
 * 0 до 1 000 000.
 */
public class Task04 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1_000_000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number == 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

}
