package tasksMdArrays;

/**
 * Даны числа n и m. Создайте массив размерностью
 * [n][m] и заполните его числами по диагонали.
 * Выведите результат на экран с соблюдением ширины столбцов.
 */
public class Task09 {
    private static final int MATRIX_WIDTH = 7;
    private static final int MATRIX_HEIGHT = 9;

    public static void main(String[] args) {
        int[][] matrix = constructDiagonalMatrix();
        System.out.println("Заполненный массив:");
        Task07.printTabMatrix(matrix);
    }

    public static int[][] constructDiagonalMatrix() {
        int[][] matrix = new int[MATRIX_HEIGHT][MATRIX_WIDTH];

        int counter = 1;
        int srcRow = 0;
        int srcColumn = 0;

        for (; srcColumn < MATRIX_WIDTH; srcColumn++) {
            counter = drawDiagonal(matrix, srcRow, srcColumn, counter);
        }
        srcRow++;
        srcColumn--;

        for (; srcRow < MATRIX_HEIGHT; srcRow++) {
            counter = drawDiagonal(matrix, srcRow, srcColumn, counter);
        }

        return matrix;
    }

    public static int drawDiagonal(int[][] matrix, int srcRow, int srcColumn, int counter) {
        int currentRow = srcRow;
        int currentColumn = srcColumn;
        while (currentRow < MATRIX_HEIGHT && currentColumn > -1) {
            matrix[currentRow][currentColumn] = counter++;
            currentRow++;
            currentColumn--;
        }
        return counter;
    }

}
