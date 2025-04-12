package tasksStrings;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры любую строку.
 * Поменять в исходной строке все большие буквы на
 * маленькие, а маленькие – на большие. Если в строке
 * присутствуют цифры, заменить на символ подчеркивания и
 * вывести результат на консоль.
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры: ");
        String text = input.nextLine();
        input.close();

        String alteredText = formatContents(text);
        System.out.println("Результат изменений:\n" + alteredText);
    }

    public static String formatContents(String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
            if (Character.isDigit(c)) {
                chars[i] = '_';
            }
        }
        return new String(chars);
    }

}
