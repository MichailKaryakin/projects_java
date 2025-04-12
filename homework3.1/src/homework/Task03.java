package homework;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("""
                1 - Horse, 2 - Dog, 3 - Dolphin,
                4 - Peacock, 5 - Fox, 6 - Cat,
                7 - Goat, 8 - Donkey, 9 - Duck,
                10 - Sheep
                """);
        Scanner scanner = new Scanner(System.in);

        int numOfAnimal = scanner.nextInt();

        scanner.close();

        switch (numOfAnimal) {
            case 1 -> System.out.println("neigh");
            case 2 -> System.out.println("bark");
            case 3 -> System.out.println("click");
            case 4 -> System.out.println("scream");
            case 5 -> System.out.println("yelp");
            case 6 -> System.out.println("meow");
            case 7, 10 -> System.out.println("bleat");
            case 8 -> System.out.println("bray");
            case 9 -> System.out.println("quack");
            default -> System.out.println("Try again");
        }
    }
}
