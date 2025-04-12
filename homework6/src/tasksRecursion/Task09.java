package tasksRecursion;

/**
 * Вычислить сумму чисел в определенном диапазоне. Начало
 * и конец диапазона задается параметрами.
 */
public class Task09 {
    public static void main(String[] args) {
        System.out.println(rangeSum(9, 1));
    }

    public static int rangeSum(int begin, int end) {
        if (begin == end) {
            return begin;
        } else if (begin < end) {
            return begin + rangeSum(begin + 1, end);
        } else {
            return begin + rangeSum(begin - 1, end);
        }
    }

}
