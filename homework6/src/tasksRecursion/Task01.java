package tasksRecursion;

/**
 * Даны два целых числа A и В. Выведите все числа от A до
 * B включительно, в порядке возрастания, если A < B, или в
 * порядке убывания – в противном случае.
 */
public class Task01 {
    public static void main(String[] args) {
        final int A = 10;
        final int B = 1;
        recursiveCount(A, B);
    }

    public static void recursiveCount(int begin, int end) {
        if (begin == end) {
            System.out.println(begin);
        } else if (begin < end) {
            System.out.println(begin);
            recursiveCount(begin + 1, end);
        } else {
            System.out.println(begin);
            recursiveCount(begin - 1, end);
        }
    }

}
