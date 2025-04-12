package tasksStrings;

import java.util.regex.Pattern;

/**
 * В американской армии считается несчастливым число 13,
 * а в китайской – 4. Перед совместными учениями с аме-
 * риканской и китайской армией, штаб украинской армии
 * решил исключить номера боевой техники, содержащие
 * числа 4 или 13 (например, 40123, 13373, 12345 или 61342),
 * чтобы не смущать иностранных коллег.
 * Написать программу, которая выведет на экран сколько
 * всего номеров придется исключить, если в распоряжении
 * армии имеется 100 тысяч единиц боевой техники и каждая
 * боевая машина имеет номер от 00000 до 99999. Решить,
 * используя строки.
 */
public class Task06 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            String formatNum = String.format("%05d ", i);
            stringBuilder.append(formatNum);
        }
        String result = stringBuilder.toString();

        Pattern pattern = Pattern.compile(" ");
        String[] numbers = pattern.split(result);

        int numsToExclude = 0;
        for (String number : numbers) {
            if ((number.contains("4")) || number.contains("13")) {
                numsToExclude++;
            }
        }

        System.out.println("Придётся исключить номеров: " + numsToExclude);
    }

}
