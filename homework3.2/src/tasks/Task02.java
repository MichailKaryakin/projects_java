package tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int number = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую степень для числа 2: ");
        int toPowerOf = scanner.nextInt();
        scanner.close();

        System.out.println("Число 2 во введённой степени: ");
        System.out.println(number << (toPowerOf - 1));
    }

}
