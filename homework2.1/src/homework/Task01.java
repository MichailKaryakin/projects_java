package homework;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two natural numbers");
        x = scanner.nextInt();
        y = scanner.nextInt();

        scanner.close();

        int div = x / y;
        int mod = x % y;
        double sqrt = Math.sqrt(x);

        System.out.printf("Div result: %d, Mod result: %d,\nSqrt of the first number: %f", div, mod, sqrt);
    }

}
