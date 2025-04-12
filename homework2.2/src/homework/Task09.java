package homework;

import java.util.Locale;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("Input a double variable, not exactly though...\n" +
                "So you may try to enter int, give it a shot.");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double dummy = scanner.nextDouble();

        double dummyMod = dummy % 1;
        if (dummyMod > 0) {
            System.out.println("Fine, user, you did it, number is real.");
        } else {
            System.out.println("That's not a real number, just an integer, stop fooling me.");
        }
    }
}
