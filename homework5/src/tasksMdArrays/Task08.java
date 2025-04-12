package tasksMdArrays;

import java.util.Scanner;

/**
 * Заполните n-мерный квадратный массив числами, которые
 * увеличиваются на 1 по спирали (число n должно задаваться с клавиатуры).
 * Выведите результат на экран с соблюдением ширины столбцов.
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размерность квадратного массива: ");
        int size = input.nextInt();
        input.close();

        int[][] matrix = constructSpiral(size);
        Task07.printTabMatrix(matrix);
    }

    public static int[][] constructSpiral(int size) {
        int[][] matrix = new int[size][size];
        int counter = 1;
        int startColumn = 0;
        int endColumn = size - 1;
        int startRow = 0;
        int endRow = size - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; i++) {
                matrix[startRow][i] = counter++;
            }
            startRow++;

            for (int j = startRow; j <= endRow; j++) {
                matrix[j][endColumn] = counter++;
            }
            endColumn--;

            if (startRow > endRow) {
                break;
            }
            for (int k = endColumn; k >= startColumn; k--) {
                matrix[endRow][k] = counter++;
            }
            endRow--;

            if (startColumn > endColumn) {
                break;
            }
            for (int l = endRow; l >= startRow; l--) {
                matrix[l][startColumn] = counter++;
            }
            startColumn++;
        }

        return matrix;
    }

}
