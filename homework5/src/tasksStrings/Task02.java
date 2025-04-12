package tasksStrings;

import java.util.Scanner;

/**
 * Написать программу, которая создаст строку, в которой
 * находятся все целые числа, начиная с 1, выписаны в одну
 * строку «123456789101112131415...». Строка должна быть
 * длиной не более 1 000 символов.
 * По числу n (введенного с клавиатуры), выведите цифру на
 * n-й позиции (используется нумерация с 1).
 */
public class Task02 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; stringBuilder.length() < 1001; i++) {
            stringBuilder.append(i);
        }

        String result = stringBuilder.substring(0, 1000);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите позицию цифры в строке: ");
        int position = input.nextInt();
        input.close();

        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if ((i + 1) == position) {
                System.out.println("Цифра в указанной позиции: " + c);
            }
        }
    }

}
