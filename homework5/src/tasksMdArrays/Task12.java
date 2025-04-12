package tasksMdArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Заполните квадратный массив размером n «ходом коня»
 * – (конь в шахматах ходит буквой «Г»). Существует простой
 * алгоритм, который позволяет гарантированно заполнить
 * доску ходом коня размерами от 5 до 70. Т. е. сначала
 * заполните массив числом 0, а потом на первой клетке (элементе
 * массива) ставится число 1, на следующей, на которую прыгает
 * конь – 2 и так до тех пор, пока не останется клеток, на
 * которые конь не ступал. Если остались нулевые значения
 * – значит алгоритм работает не верно. Выведите массив на
 * экран. Размерность массва должна задаваться с клавиатуры.
 */
public class Task12 {
    int matrixSize = 5;
    int[][] chessBoard;
    int counter;

    public Task12(int matrixSize) {
        this.matrixSize = matrixSize;
        chessBoard = new int[this.matrixSize][this.matrixSize];
        counter = 0;
    }

    public static void main(String[] args) {
        System.out.println("Введите размерность доски:");
        Scanner input = new Scanner(System.in);
        Task12 task12 = new Task12(input.nextInt());
        task12.knightTour(0, 0);
        task12.printBoard();
    }

    public void knightTour(int row, int column) {
        if (row > (matrixSize - 1) || row < 0 || column > (matrixSize - 1) || column < 0) {
            return;
        } else if (chessBoard[row][column] > 0) {
            return;
        } else {
            chessBoard[row][column] = counter;
            counter++;
            knightTour(row - 1, column - 2);
            knightTour(row - 1, column + 2);
            knightTour(row + 1, column - 2);
            knightTour(row + 1, column + 2);
            knightTour(row - 2, column - 1);
            knightTour(row - 2, column + 1);
            knightTour(row + 2, column - 1);
            knightTour(row + 2, column + 1);
        }
    }

    public void printBoard() {
        for (int[] row : chessBoard) {
            System.out.println(Arrays.toString(row));
        }
    }

}
