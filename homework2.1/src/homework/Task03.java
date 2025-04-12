package homework;

import java.util.Locale;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Input real number");
        double n = scanner.nextDouble();

        scanner.close();

        double realPart = n % 1;
        int naturalPart = (int) (n - (realPart));

        int roundedN;
        if (realPart >= 0.5) {
            roundedN = naturalPart + 1;
        } else {
            roundedN = naturalPart;
        }

        System.out.printf("Here it is rounded: %d", roundedN);
    }

}
