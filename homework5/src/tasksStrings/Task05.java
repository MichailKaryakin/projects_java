package tasksStrings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Ввести строку с клавиатуры. В строке должны содержаться
 * слова, которые могут быть разделены пробелами или
 * двоеточиями. Необходимо вычислить количество слов в
 * строке, у которых четное количество букв.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры: ");
        String text = input.nextLine();
        input.close();

        Pattern pattern = Pattern.compile("[\\s*:]+");
        String[] words = pattern.split(text);

        int numOfEvenLetteredWords = 0;
        for (String word : words) {
            if (Pattern.matches("^(..)*$", word)) {
                numOfEvenLetteredWords++;
            }
        }

        System.out.println("Количество слов с чётным количеством букв = " + numOfEvenLetteredWords);
    }

}
