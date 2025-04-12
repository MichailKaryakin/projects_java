package homework;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Input the hour");
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();

        scanner.close();

        if (hour >= 6 && hour < 12) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Happy afternoon");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Merry evening");
        } else if (hour >= 0 && hour < 6) {
            System.out.println("Good night");
        } else {
            System.out.println("Sadly, no such hour. Earth has only 24.");
        }
    }
}
