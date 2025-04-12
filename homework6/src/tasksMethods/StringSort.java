package tasksMethods;

import java.util.*;

/**
 * Класс для выполнения третьего задания
 */
public class StringSort {
    Comparator<String> stringComparator = (string1, string2) -> {
        String[] words1 = null;
        String[] words2 = null;
        try {
            words1 = string1.split(" ");
            words2 = string2.split(" ");
        } catch (Exception e) {
            //ignore
        }

        if (words1 != null && words2 != null) {
            return Integer.compare(words1.length, words2.length);
        } else if (words1 != null) {
            return 1;
        } else {
            return -1;
        }
    };

    public String toSingleString(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : array) {
            stringBuilder.append(string).append(' ');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

    public void reverseCaseInsensitiveSort(String[] array) {
        Arrays.sort(array, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
    }

    public void sortByNumOfWords(String[] array) {
        Arrays.sort(array, stringComparator);
    }

    public String generateUniqueString() {
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        Random random = new Random();
        int charsLength = chars.length;

        StringBuilder stringBuilder = new StringBuilder();
        int numOfWords = random.nextInt(1, 10);
        for (int i = 0; i < numOfWords; i++) {
            int numOfSymbols = random.nextInt(1, 10);
            for (int j = 0; j < numOfSymbols; j++) {
                int index = random.nextInt(charsLength - i - 1);
                char charToPut = chars[i + index];
                chars[i + index] = chars[i];
                chars[i] = charToPut;
                stringBuilder.append(charToPut);
            }
            stringBuilder.append(' ');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }

}
