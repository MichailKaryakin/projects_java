package tasksRecursion;

/**
 * Вычислить результат возведения числа m в степень n,
 * используя рекурсию. В статический метод передается 2
 * параметра – число и степень.
 */
public class Task08 {
    public static void main(String[] args) {
        System.out.println(toPower(3, 12));
    }

    public static int toPower(int number, int power) {
        if (power == 1) {
            return number;
        } else {
            return number * toPower(number, power - 1);
        }
    }

}
