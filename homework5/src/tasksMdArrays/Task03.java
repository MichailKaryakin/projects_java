package tasksMdArrays;

/**
 * Создать массив из 200 случайных чисел в диапазоне от 0
 * до 200. Определить количество одноразрядных, двухразрядных
 * и трёхразрядных чисел в процентном отношении. Вывести
 * на консоль полученный массив и количество по разрядам.
 */
public class Task03 {
    private static final int ARRAY_LENGTH = 200;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_LENGTH];
        Task02.arrayRandomizer(array, 0, 201);
        printArray(array);
        double[] ratios = byOldestRankRatio(array);

        System.out.printf("Одноразрядных чисел, в процентах: %.01f\n", ratios[0] * 100);
        System.out.printf("Двухразядных чисел в процентах: %.01f\n", ratios[1] * 100);
        System.out.printf("Трёхразрядных чисел в процентах: %.01f", ratios[2] * 100);
    }

    public static double[] byOldestRankRatio(int[] array) {
        double[] ranksRatio = new double[3];
        for (int j : array) {
            if (j > 99) {
                ranksRatio[2]++;
            } else if (j > 9) {
                ranksRatio[1]++;
            } else {
                ranksRatio[0]++;
            }
        }

        for (int i = 0; i < 3; i++) {
            ranksRatio[i] = ranksRatio[i] / 200;
        }

        return ranksRatio;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            boolean conditionOne = (i < array.length - 1);
            boolean conditionTwo = (((i + 1) % 20) == 0);
            if (conditionOne && !conditionTwo) System.out.print("\t");
            if (conditionTwo) System.out.println();
        }
        System.out.println();
    }

}
