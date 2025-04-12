package tasksExceptions;

import java.util.Random;
import java.util.Scanner;

/**
 * Создать метод, который выводит в консоль результат
 * целочисленного деления числа, введенного с клавиатуры, на
 * значения элементов одномерного массива целых чисел,
 * заполненный случайным образом – от -10 до 10.
 * Длина массива случайная – от 1 до 10.
 * Обработать все возможные исключительные ситуации в
 * данном методе.
 */
public class Task01 {
    int[] array;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Task01 task01 = new Task01();
        task01.randomizeArray();
        System.out.println("Введите число:");
        task01.divideArrayByInt(task01.scanner.nextInt());
        task01.scanner.close();
    }

    private void randomizeArray() {
        Random random = new Random();
        int arrayLength = random.nextInt(1, 11);
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(-10, 11);
        }
    }

    private void divideArrayByInt(int coefficient) {
        try {
            for (int i = 0; i < array.length; i++) {
                int divisionResult = coefficient / array[i];
                System.out.println("Деление на " + i + "-й элемент: " + divisionResult);
            }
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
    }
}
