package tasksMdArrays;

/**
 * Заполните n-мерный квадратный массив возрастающими
 * числами – змейкой. Выведите результат на экран с
 * соблюдением ширины столбцов
 */
public class Task07 {
    private static final int squareMatrixSize = 10;

    public static void main(String[] args) {
        int[][] matrix = new int[squareMatrixSize][squareMatrixSize];
        fillMatrixSnake(matrix);
        System.out.println("Заполненный массив: ");
        printTabMatrix(matrix);
    }

    public static void fillMatrixSnake(int[][] matrix) {
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = counter++;
                }
            } else {
                for (int j = matrix[i].length - 1; j > -1; j--) {
                    matrix[i][j] = counter++;
                }
            }
        }
    }

    public static void printTabMatrix(int[][] matrix) {
        int count = matrix.length * matrix[0].length;
        int power = 0;

        while (count / Math.pow(10, power) > 1) {
            power++;
        }

        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%" + (power + 2) + "d", ints[j]);
            }
            System.out.println();
        }
    }

}
