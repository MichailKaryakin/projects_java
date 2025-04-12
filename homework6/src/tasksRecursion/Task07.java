package tasksRecursion;

/**
 * Дано предложение, состоящее только из строчных
 * латинских букв. Проверьте, являются ли слова в предложении
 * палиндромом. Выведите YES или NO.
 */
public class Task07 {
    public static void main(String[] args) {
        final String sentence = "funny task, not a slightest clue how to get it done without strings and cycles. radar";
        String[] array = sentence.split("\\W+");
        for (String word : array) {
            if (isPalindrome(word)) {
                System.out.print("YES ");
            } else {
                System.out.print("NO ");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return isPalindrome(word.substring(1, word.length() - 1));
        }
        return false;
    }

}
