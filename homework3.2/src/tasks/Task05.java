package tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый к обнулению бит: ");
        int numOfBit = scanner.nextInt();
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int changedNumber = clearGivenBit(number, numOfBit);
        scanner.close();

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Бит в позиции " + numOfBit + " обнулён: ");
        printToBinary(changedNumber);
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%10s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

    private static int clearGivenBit(int number, int bitNumber) {
        return number & ~(1 << bitNumber);
    }

}
