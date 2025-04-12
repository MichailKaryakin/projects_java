package tasks;

import java.util.Scanner;

/**
 * В первый день спортсмен пробежал x километров, а затем
 * он каждый день увеличивал пробег на 10% от предыдущего
 * значения. По числу, указанному с клавиатуры y, определите
 * номер дня, на который пробег спортсмена составит не менее
 * y километров.
 */
public class Task12 {
    public static void main(String[] args) {
        int distance = 100;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число y: ");
        int breakNumber = input.nextInt();

        int i = 0;
        for (; distance < breakNumber; i++) {
            distance *= 1.1;
        }

        System.out.println("Пробег составит не менее " + breakNumber + " км на " + i + "-ый день");
    }

}
