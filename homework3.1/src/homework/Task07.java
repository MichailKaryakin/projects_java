package homework;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Enter a letter");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next(".").charAt(0);

        if (((letter >= 0x41) && (letter <= 0x5A)) || ((letter >= 0x61) && (letter <= 0x7A))) {
            System.out.println("Latin");
        } else if ((letter >= 0x410) && (letter <= 0x44F)) {
            System.out.println("Cyrillic");
        } else if ((letter >= 0x30) && (letter <= 0x39)) {
            System.out.println("Digit");
        } else {
            System.out.println("Impossible to identify");
        }
    }
}
