package tasksMdArrays;

import java.util.Scanner;

/**
 * Ввести c клавиатуры число в диапазоне от 0 до 1 000 000
 * включительно. Озвучить его русскими словами. Учесть, что
 * для разных чисел могут быть различные окончание слов,
 * например «одна тысяча», «две тысячи», «пять тысяч».
 */
public class Task11 {
    private static final String[][] firstTen = {
            {"одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"один", "два"}};
    private static final String[] secondTen = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
            "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] afterTens = {"двадцать", "тридцать", "сорок", "пятьдесят",
            "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private static final String[] hundreds = {"сто", "двести", "триста", "четыреста", "пятьсот",
            "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String[][] bigNumbers = {
            {},
            {"тысяча", "тысячи", "тысяч"},
            {"миллион", "миллиона", "миллионов"},
            {"миллиард", "миллиарда", "миллиардов"},
            {"триллион", "триллиона", "триллионов"}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для преобразования в буквы:");
        System.out.println(toWords(input.nextInt()));
    }

    public static String toWords(long money) {
        if (money < 0) {
            return "отрицательное значение";
        }
        return generateString(money, 0);
    }

    private static String generateString(long number, int level) {
        StringBuilder words = new StringBuilder();
        if (number == 0) words.append("ноль");

        int sex = 0;
        switch (level) {
            case 0, 2, 3, 4 -> sex = 1;
            case 1 -> sex = 0;
        }

        int hundred = (int) (number % 1000);
        int decade = hundred / 100;
        if (decade > 0) words.append(hundreds[decade - 1]).append(" ");
        int firstDigit = hundred % 100;
        decade = firstDigit / 10;
        firstDigit = firstDigit % 10;

        if (decade == 1) {
            words.append(secondTen[firstDigit]).append(" ");
        } else {
            words.append(afterTens[decade - 2]).append(" ");
        }

        if (decade == 1) {
            firstDigit = 0;
        }
        if (firstDigit == 2) {
            words.append(firstTen[sex][firstDigit - 1]).append(" ");
        } else {
            words.append(firstTen[0][firstDigit - 1]).append(" ");
        }

        switch (firstDigit) {
            case 1 -> words.append(bigNumbers[level][0]);
            case 2, 3, 4 -> words.append(bigNumbers[level][1]);
        }

        long nextNum = number / 1000;
        if (nextNum > 0) {
            return (generateString(nextNum, level + 1) + " " + words).trim();
        } else {
            return words.toString().trim();
        }
    }

}
