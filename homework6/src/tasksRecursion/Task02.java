package tasksRecursion;

/**
 * Дано натуральное число N. Выведите слово YES, если число
 * N является точной степенью двойки, или слово NO – в
 * противном случае.
 */
public class Task02 {
    public static void main(String[] args) {
        final int N = 4096;
        if (isPowerTwo(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPowerTwo(int number) {
        if (number == 1) {
            return true;
        } else if (number % 2 != 0) {
            return false;
        } else {
            return isPowerTwo(number / 2);
        }
    }
}
