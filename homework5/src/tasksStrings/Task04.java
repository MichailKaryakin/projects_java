package tasksStrings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Ввести строку с клавиатуры (латиницей). Из введенной
 * строки выбрать все слова, начинающиеся на гласные буквы
 * и заканчивающиеся на согласные. Вывести отобранные
 * слова на консоль.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку латиницей: ");
        String text = input.nextLine();
        input.close();

        Pattern pattern = Pattern.compile("[\\s*,.!?;]");
        String[] words = pattern.split(text);

        for (String word : words) {
            if (Pattern.matches("(?s)^[aeiouy].*[bcdfghjklmnpqrstvwxz]$", word)) {
                System.out.println(word);
            }
        }
    }

}
