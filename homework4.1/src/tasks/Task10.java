package tasks;

/**
 * 2520 – наименьшее число, которое можно разделить на
 * каждое из чисел от 1 до 10, без остатка. Написать программу,
 * которая рассчитывает наименьшее положительное число,
 * которое делится на все числа от 1 до 20.
 */
public class Task10 {
    public static void main(String[] args) {
        boolean found = false;
        int foundNumber = 0;

        for (int i = 1; !found; i++) {
            for (int j = 1; j < 21; j++) {
                if (i % j != 0) {
                    break;
                }
                if (j == 20) {
                    found = true;
                    foundNumber = i;
                    break;
                }
            }
        }

        System.out.println("Найденное число = " + foundNumber);
    }

}
