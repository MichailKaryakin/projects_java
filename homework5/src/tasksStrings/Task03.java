package tasksStrings;

import java.util.Scanner;

/**
 * Подсчитать среднюю длину слова, во введенном с
 * клавиатуры предложении.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String sentence = input.nextLine();
        input.close();

        System.out.println("Средняя длина слова во введённом предложении = " + medianWordLength(sentence));
    }

    public static boolean isLetter(char c) {
        if ((int) c >= 0x0041 && (int) c <= 0x005A) {
            return true;
        } else if ((int) c >= 0x0061 && (int) c <= 0x007A) {
            return true;
        } else return (int) c >= 0x0410 && (int) c <= 0x044F;
    }

    public static double medianWordLength(String text) {
        double lettersCount = 0;
        double wordsCount = 0;
        boolean wordProcessing = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isLetter(c)) {
                lettersCount++;
                wordProcessing = true;
            } else if ((wordProcessing) && !isLetter(c)) {
                wordsCount++;
                wordProcessing = false;
            }
            if (((i + 1) == text.length()) && wordProcessing) {
                wordsCount++;
            }
        }

        return lettersCount / wordsCount;
    }

}
