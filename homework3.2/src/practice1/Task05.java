package practice1;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Input the hour");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        scanner.close();

        if (hour >= 6 && hour < 13) {
            System.out.println("Good morning");
        } else if (hour >= 13 && hour < 18) {
            System.out.println("Good day");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening");
        } else if (hour >= 0 && hour < 6) {
            System.out.println("Good night");
        } else {
            System.out.println("Sadly, no such hour. Earth has only 24.");
        }
    }

}
