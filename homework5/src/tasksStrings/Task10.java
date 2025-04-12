package tasksStrings;

import java.util.Scanner;

/**
 * Напишите программу, которая будет печатать
 * ромбовидный рисунок на основе строки, введенной с
 * клавиатуры (максимальная длина – 50 символов).
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку, максимум 50 символов: ");
        String string = input.nextLine();
        input.close();

        string = formatString(string);
        directOrder(string);
        reversedOrder(string);
    }

    public static String formatString(String string) {
        if (string.length() > 50) {
            string = string.substring(0, 50);
        }
        return string;
    }

    public static void directOrder(String string) {
        for (int i = string.length() - 1; i > -1; i--) {
            int stringIterator = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < string.length(); j++) {
                if (j < i) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append(string.charAt(stringIterator++));
                }
            }
            System.out.println(stringBuilder);
        }
    }

    public static void reversedOrder(String string) {
        for (int i = 1; i < string.length(); i++) {
            int j = i;
            while (j < string.length()) {
                System.out.print(string.charAt(j++));
            }
            System.out.println();
        }
    }

}
