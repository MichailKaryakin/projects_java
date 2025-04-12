package tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый к инвертированию бит: ");
        int numOfBit = scanner.nextInt();
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int changedNumber = flipBit(numOfBit, number);
        scanner.close();

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Бит в позиции " + numOfBit + " инвертирован: ");
        printToBinary(changedNumber);
    }

    public static int flipBit(int position, int value) {
        return value ^ 1 << position;
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%10s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

}
