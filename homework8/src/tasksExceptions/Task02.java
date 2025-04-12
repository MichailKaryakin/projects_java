package tasksExceptions;

import java.util.Scanner;

/**
 * Создать метод, принимающий на вход число. В случае,
 * если число отрицательное, в методе должно быть брошено
 * проверяемое исключение. Если число больше 100, должно
 * быть брошено непроверяемое исключение.
 * Создать свои исключения для данного примера.
 */
public class Task02 {
    public static void main(String[] args) {
        Task02 task02 = new Task02();
        try {
            System.out.println("Введите число:");
            task02.handler(new Scanner(System.in).nextInt());
        } catch (NegativeNumberException | BiggerThanHundredException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void handler(int number) throws NegativeNumberException, BiggerThanHundredException {
        if (number < 0) {
            throw new NegativeNumberException("Негативное число");
        }
        if (number > 100) {
            throw new BiggerThanHundredException("Число больше 100");
        }
    }
}
