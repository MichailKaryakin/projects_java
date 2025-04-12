package practice1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество метров");
        int metres = input.nextInt();
        System.out.println("1 - в мили, 2 - в дюймы, 3 - в ярды");
        int userChoice = input.nextInt();
        input.close();

        if (userChoice == 1) {
            System.out.println(getMiles(metres));
        } else if (userChoice == 2) {
            System.out.println(getInches(metres));
        } else if (userChoice == 3) {
            System.out.println(getYards(metres));
        } else {
            System.out.println("Нет такого пункта...");
        }
    }

    public static double getMiles(int metres) {
        return metres / 1609.34;
    }

    public static double getInches(int metres) {
        return metres * 39.37;
    }

    public static double getYards(int metres) {
        return metres * 1.09;
    }

}
