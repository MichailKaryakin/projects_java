package practice1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите три числа");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("1 - максимум, 2 - минимум, 3 - среднее");
        int userChoice = input.nextInt();
        input.close();

        if (userChoice == 1) {
            int max = Math.max(num1, num2);
            max = Math.max(max, num3);
            System.out.println(max);
        } else if (userChoice == 2) {
            int min = Math.min(num1, num2);
            min = Math.max(min, num3);
            System.out.println(min);
        } else if (userChoice == 3) {
            double mean = (double) (num1 + num2 + num3) / 3;
            System.out.println(mean);
        } else {
            System.out.println("Нет такого пункта...");
        }
    }

}
