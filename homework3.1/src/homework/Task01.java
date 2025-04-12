package homework;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Input the number of day");
        Scanner scanner = new Scanner(System.in);

        int numOfDay = scanner.nextInt();

        scanner.close();

        switch (numOfDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Try again");
        }
    }
}
