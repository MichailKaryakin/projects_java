package tasksStrings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * В языке Java принято первое слово, входящее в название
 * переменной, записывать с маленькой латинской буквы.
 * Следующее слово идет с большой буквы (только первая
 * буква слова – большая). Слова не имеют разделителей и
 * состоят только из латинских букв. Например, правильные
 * записи переменных в Java могут выглядеть следующим
 * образом: javaIdentifier, longAndMnemonicIdentifier,
 * name, nEERC.
 * В языке C++ для описания переменных используются
 * только маленькие латинские символы и символ «_»,
 * который отделяет непустые слова друг от друга. Если
 * строка имеет смешанный синтаксис: например java_
 * Identifier, сообщить об этом. Примеры: java_identifier,
 * long_and_mnemonic_identifier, name, n_e_e_r_c.
 * Вам требуется написать программу, которая преобразует
 * переменную, записанную на одном языке, в формат другого
 * языка. Идентификатор (имя) переменной должен вводится с
 * клавиатуры. Программа должна определить, из какого языка
 * взята переменная, и переделать ее в переменную другого
 * языка. Вывести результат на консоль.
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название переменной: ");
        String variable = input.nextLine();
        input.close();

        variable = parseVariable(variable);

        System.out.println("Результат: " + variable);
    }

    public static String parseVariable(String variable) {
        if (variable.contains("_")) {
            return toJavaCase(variable);
        } else {
            return toCppCase(variable);
        }
    }

    public static String toJavaCase(String variable) {
        Pattern pattern = Pattern.compile("_");
        String[] words = pattern.split(variable);

        StringBuilder resultingName = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i > 0) {
                word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            resultingName.append(word);
        }

        return resultingName.toString();
    }

    public static String toCppCase(String variable) {
        Pattern pattern = Pattern.compile("(?=\\p{Lu})");
        String[] words = pattern.split(variable);

        StringBuilder resultingName = new StringBuilder();
        for (String word : words) {
            resultingName.append(word.toLowerCase()).append("_");
        }
        resultingName.deleteCharAt(resultingName.lastIndexOf("_"));

        return resultingName.toString();
    }

}
