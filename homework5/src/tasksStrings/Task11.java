package tasksStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Слова в языке Мумба-Юмба могут состоять только из букв
 * a, b, c, и при этом:
 * - никогда не содержат двух букв b подряд;
 * - ни в одном слове никогда не встречается три одинаковых
 * подслова подряд. Например, по этому правилу, в язык
 * Мумба-Юмба не могут входить слова aaa (так как три
 * раза подряд содержит подслово a), ababab (так как три
 * раза подряд содержит подслово ab), aabcabcabca (три
 * раза подряд содержит подслово abc).
 * Все слова, удовлетворяющие вышеописанным правилам,
 * входят в язык Мумба-Юмба.
 * Напишите программу, которая по данному слову
 * (введеному с клавиатуры) определит, принадлежит ли оно этому
 * языку.
 */
public class Task11 {
    private static final int MAGIC_NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("Введите слово для проверки:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        if (checkVocabulary(word) && checkCombinations(word)) {
            System.out.println("Слово принадлежит языку");
        } else {
            System.out.println("Слово не принадлежит языку");
        }
    }

    public static boolean checkVocabulary(String word) {
        return Pattern.matches("[abc]*", word);
    }

    public static boolean checkCombinations(String word) {
        return !doubleB(word) && !tripleAnything(word);
    }

    public static boolean doubleB(String word) {
        int tempIndex = 0;
        for (int i = 1; i < word.length(); i++, tempIndex++) {
            char tempChar = word.charAt(tempIndex);
            if (word.charAt(i) == 'b' && tempChar == 'b') {
                return true;
            }
        }
        return false;
    }

    public static boolean tripleAnything(String word) {
        int subWordLength = 1;
        while (subWordLength <= (word.length() / MAGIC_NUMBER)) {
            for (int i = 0; i < word.length(); i++) {
                if ((i + subWordLength * MAGIC_NUMBER) > word.length()) {
                    continue;
                }
                List<String> listOfAnythings = new ArrayList<>(MAGIC_NUMBER);
                int tempBegin = i;
                int tempEnd = i + subWordLength;
                for (int j = 0; j < MAGIC_NUMBER; j++) {
                    listOfAnythings.add(getFromString(tempBegin, tempEnd, word));
                    tempBegin = tempEnd;
                    tempEnd = tempBegin + subWordLength;
                }
                boolean isEqual = true;
                for (int k = 0; k < (MAGIC_NUMBER - 1); k++) {
                    isEqual &= listOfAnythings.get(k).equals(listOfAnythings.get(k + 1));
                }
                if (isEqual) {
                    return true;
                }
            }
            subWordLength++;
        }
        return false;
    }

    public static String getFromString(int begin, int end, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = begin; i < end; i++) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

}
