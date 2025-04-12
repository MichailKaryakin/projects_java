package tasks;

/**
 * Написать программу, которая выводит на экран все
 * простые числа в диапазоне от 2 до 1 000 000.
 */
public class Task02 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1_000_000; i++) {
            if (isSimple(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSimple(int number) {
        if (number == 2) {
            return true;
        }
        for (int div = 2; div <= Math.sqrt(number); div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }

}
