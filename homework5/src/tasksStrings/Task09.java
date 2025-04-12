package tasksStrings;

import java.util.HashMap;

/**
 * Написать программу, проверяющую является ли одна
 * строка анаграммой для другой строки (строка может состоять
 * из нескольких слов и символов пунктуации). Пробелы и
 * пунктуация должны игнорироваться при анализе. Разница
 * в больших и маленьких буквах должна игнорироваться. Обе
 * строки должны вводиться с клавиатуры. Программа должна
 * выводить Yes, если строки являются анаграммой, и No –
 * иначе.
 */
public class Task09 {
    public static void main(String[] args) {
        String original = "Tom Marvolo Riddle";
        String suspectedAnagram = "I am Lord Voldemort";

        if (getMapOfLetters(original).equals(getMapOfLetters(suspectedAnagram))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static HashMap<Character, Integer> getMapOfLetters(String string) {
        HashMap<Character, Integer> mapOfLetters = new HashMap<>();

        for (char c : string.toCharArray()) {
            if (Task03.isLetter(c)) {
                mapOfLetters.merge(Character.toLowerCase(c), 1, Integer::sum);
            }
        }

        return mapOfLetters;
    }

}
