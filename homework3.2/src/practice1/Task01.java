package practice1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int number = input.nextInt();
        input.close();
        if (isEven(number)) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
