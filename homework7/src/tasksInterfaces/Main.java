package tasksInterfaces;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.createArray();
        main.scanner.close();
    }

    private void createArray() {
        System.out.println("Введите размер массива:");
        Array array = new Array(scanner.nextInt());
        scanner.nextLine();
        showIShow(array);
        showIMath(array);
        showISort(array);
    }

    private void showIShow(Array array) {
        array.print();
        System.out.println("Введите сообщения для метода Print");
        array.print(scanner.nextLine());
    }

    private void showIMath(Array array) {
        System.out.println("Максимальное значение массива: " + array.max());
        System.out.println("Минимальное значение массива: " + array.min());
        System.out.println("Среднее значение массива: " + array.avg());
    }

    private void showISort(Array array) {
        System.out.println("Отсортированный по возрастанию:");
        array.sortAsc();
        array.print();
        System.out.println("Отсортированный по убыванию:");
        array.sortDesc();
        array.print();
    }

}
