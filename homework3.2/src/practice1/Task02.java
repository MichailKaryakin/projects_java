package practice1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите три числа");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("1 - сумма чисел, 2 - произведение чисел");
        int userChoice = input.nextInt();
        input.close();

        if (userChoice == 1) {
            System.out.println(num1 + num2 + num3);
        } else if (userChoice == 2) {
            System.out.println(num1 * num2 * num3);
        } else {
            System.out.println("Нет такого пункта...");
        }
    }

}
