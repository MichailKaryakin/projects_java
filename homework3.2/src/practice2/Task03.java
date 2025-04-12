package practice2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        scanner.close();
        printSeason(month);
    }

    public static void printSeason (int month) {
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Error");
        }
    }
}
