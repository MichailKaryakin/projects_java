package practice2;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 100: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        checkNumber(number);
        fizzBuzzPrint(number);
    }

    private static void fizzBuzzPrint(int number) {
        boolean fizzCondition = (number % 3 == 0);
        boolean buzzCondition = (number % 5 == 0);
        if (fizzCondition) {
            System.out.print("Fizz ");
        }
        if (buzzCondition) {
            System.out.println("Buzz");
        }
        if (!fizzCondition && !buzzCondition) {
            System.out.println(number);
        }
    }

    private static void checkNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("Неправильный ввод");
            System.exit(-1);
        }
    }
}
