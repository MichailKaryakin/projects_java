package tasksMethods;

import java.util.Arrays;

/**
 * Написать и протестировать методы работы с квадратными
 * матрицами (матрицы представить в виде двухмерных
 * массивов).
 * Должны присутствовать методы:
 * - создания единичной (диагональной) матрицы;
 * - создания нулевой матрицы;
 * - сложение матриц;
 * - умножения матриц;
 * - умножение матрицы на скаляр;
 * - определение детерминанта матрицы;
 * - вывод матрицы на консоль.
 */
public class Task01 {
    public int[][] createDiagonalMatrix(int[][] matrix) {
        int cellToWrite = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == cellToWrite) {
                    matrix[i][j] = 1;
                    cellToWrite++;
                    break;
                }
            }
        }

        return matrix;
    }

    public int[][] createNullMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            Arrays.fill(ints, 0);
        }

        return matrix;
    }

    public int[][] matrixGetSum(int[][] matrix) {
        int[][] resultingMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                resultingMatrix[i][j] = matrix[i][j] + matrix[i][j];
            }
        }

        return resultingMatrix;
    }

    public int[][] matrixMultiply(int[][] matrixFirst, int[][] matrixSecond) {
        int[][] resultingMatrix = new int[matrixFirst.length][matrixFirst.length];

        for (int i = 0; i < matrixFirst.length; i++) {
            for (int j = 0; j < matrixFirst.length; j++) {
                for (int k = 0; k < matrixFirst.length; k++) {
                    resultingMatrix[i][j] = matrixFirst[i][k] * matrixSecond[k][j];
                }
            }
        }

        return resultingMatrix;
    }

    public int[][] matrixByScalar(int[][] matrix, int scalar) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= scalar;
            }
        }

        return matrix;
    }

    public int matrixGetDeterminant(int[][] matrix, int size) {
        if (size == 1) {
            return matrix[0][0];
        }

        if (size == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int determinant = 0;
        for (int column = 0; column < size; ++column) {
            int[][] subArray = new int[size - 1][size - 1];

            for (int i = 1; i < size; ++i) {
                int subColumn = 0;
                for (int j = 0; j < size; ++j) {
                    if (j == column) continue;
                    subArray[i - 1][subColumn++] = matrix[i][j];
                }
            }

            int sign = (column % 2 == 0) ? 1 : -1;
            determinant += sign * matrix[0][column] * matrixGetDeterminant(subArray, size - 1);
        }

        return determinant;
    }

    public void printMatrix(int[][] matrix) {
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
