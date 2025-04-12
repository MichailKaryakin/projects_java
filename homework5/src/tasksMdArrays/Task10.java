package tasksMdArrays;

import java.util.*;

/**
 * В кинотеатре n рядов по m мест в каждом (m и n должно
 * задаваться с клавиатуры). В двумерном массиве размерностью
 * m на n хранится информация о проданных билетах.
 * Число 1 означает, что билет на данное место уже продан,
 * число 0 означает, что место свободно. Поступил запрос на
 * продажу k билетов на соседние места в одном ряду (k должно
 * задаваться с клавиатуры).
 * Определите, можно ли выполнить такой запрос. Если решения
 * есть, вывести номера рядов и номера свободных мест для продажи.
 * Число занятых мест и какие места заняты на момент запроса
 * определите случайным образом.
 * Вывести исходный массив на экран.
 */
public class Task10 {
    private static int rows;

    private static int columns;

    private static int seats;

    private static int[][] cinemaMatrix;

    public static void main(String[] args) {
        doInputs();
        initMatrix();
        searchMatrix();
    }

    public static void doInputs() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество рядов и мест на ряд: ");
        rows = input.nextInt();
        columns = input.nextInt();
        System.out.println("Введите количество запрашиваемых мест: ");
        seats = input.nextInt();
        input.close();
    }

    public static void initMatrix() {
        cinemaMatrix = new int[rows][columns];
        fillMatrix(cinemaMatrix);
    }

    public static void searchMatrix() {
        HashMap<Integer, ArrayList<Integer>> availableSeats = processRequest(cinemaMatrix, seats);
        if (availableSeats.isEmpty()) {
            System.out.println("Извините, найти такое количество подряд идущих мест не получилось...");
        } else {
            int numOfSolution = 1;
            for (Map.Entry<Integer, ArrayList<Integer>> entry : availableSeats.entrySet()) {
                System.out.println("Возможное решение номер " + numOfSolution++);
                Integer key = entry.getKey();
                ArrayList<Integer> values = entry.getValue();
                for (Integer value : values) {
                    int temp_value = value - seats + 1;
                    while (temp_value <= value) {
                        System.out.println("Свободно для продажи. Ряд: " + key + ". Место: " + temp_value);
                        temp_value++;
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void fillMatrix(int[][] matrix) {
        Random randomizer = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(0, 2);
            }
        }
    }

    public static HashMap<Integer, ArrayList<Integer>> processRequest(int[][] matrix, int seatsToFind) {
        HashMap<Integer, ArrayList<Integer>> availableSeats = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int consecutiveSeats = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    consecutiveSeats++;
                } else {
                    consecutiveSeats = 0;
                }
                if (consecutiveSeats == seatsToFind) {
                    availableSeats.put(i, new ArrayList<>());
                    availableSeats.get(i).add(j);
                } else if (consecutiveSeats > seatsToFind) {
                    availableSeats.get(i).add(j);
                }
            }
        }
        return availableSeats;
    }

}
