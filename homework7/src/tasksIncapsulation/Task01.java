package tasksIncapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с
 * клавиатуры n диапазонов целочисленных значений (например,
 * 3-10). Каждый диапазон имеет начальную и конечную точку.
 * После ввода программа должна вывести длину каждого
 * диапазона. Программа должна выводить сообщение об ошибке,
 * если начало диапазона больше, чем конец.
 */
public class Task01 {
    public static void main(String[] args) {
        List<Range> objectList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество диапазонов:");
        int numOfObjects = input.nextInt();

        for (int i = 0; i < numOfObjects; i++) {
            System.out.println("Введите диапазон:");
            int begin = input.nextInt();
            int end = input.nextInt();
            Range range = new Range(begin, end);
            objectList.add(range);
        }

        for (int i = 0; i < numOfObjects; i++) {
            Range temp = objectList.get(i);
            if (temp.check()) {
                System.out.println("Длина диапазона под индексом " + i + ":");
                System.out.println(temp.length());
            } else {
                System.out.println("Error, begin value is higher (index " + i + ")");
            }
        }

        System.out.println("Введите индексы диапазонов для проверки на пересечение:");
        int indexOne = input.nextInt();
        int indexTwo = input.nextInt();
        Task02 task02 = new Task02();
        task02.checkCrossings(objectList.get(indexOne), objectList.get(indexTwo));
    }

}
