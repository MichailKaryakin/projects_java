package homework;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((!(year % 4 == 0) || (year % 100 == 0)) && !(year % 400 == 0)) {
            System.out.println("Not a leap year");
        } else {
            System.out.println("It is a leap year");
        }
    }
}
