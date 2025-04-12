package tasksStrings;

import java.util.Scanner;

/**
 * Ввести с клавиатуры строку текста, а затем один символ.
 * Показать на консоль индексы и количество совпадений (ищем
 * вхождения символа в строку). В случае если совпадений не
 * найдено, вывести соответствующий текст.
 */
public class Task01 {
    private static int entries = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String text = input.nextLine();
        System.out.println("Введите символ: ");
        char character = input.next().charAt(0);
        input.close();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == character) {
                System.out.println("Вхождение под индексом: " + i);
                entries++;
            }
        }

        System.out.println("Количество вхождений итого: " + entries);
    }

}
