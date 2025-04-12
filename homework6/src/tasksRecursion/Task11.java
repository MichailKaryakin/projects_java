package tasksRecursion;

import java.util.*;

/**
 * Дана шахматная доска размером 8х8, и шахматный конь.
 * Программа должна запросить у пользователя координаты
 * клетки поля и поставить туда коня. Задача программы
 * – найти методом перебора путь коня, при котором он обойдет все
 * клетки доски, становясь в каждую клетку только один раз.
 */
public class Task11 {
    private final int size = 8;
    private final boolean[][] chessBoard = new boolean[size][size];
    private int checked = 0;

    public static void main(String[] args) {
        Task11 task11 = new Task11();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты начала:");
        task11.knightTour(input.nextInt(), input.nextInt());
        input.close();
        System.out.println("Количество ходов:");
        System.out.println(task11.checked);
    }

    public void knightTour(int row, int column) {
        if (checked == 0) {
            System.out.println("Путь коня:");
        }
        if (row > 7 || row < 0 || column > 7 || column < 0) {
            return;
        } else if (chessBoard[row][column]) {
            return;
        } else {
            chessBoard[row][column] = true;
            System.out.println(row + " " + column);
            checked++;
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
}
