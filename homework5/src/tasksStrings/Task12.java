package tasksStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите программу, которая посчитает количество
 * смайликов в заданном тексте.
 */
public class Task12 {
    public static void main(String[] args) {
        String smiles = ":-))))[]:):-{{{:]])";
        String regex = "[;{1}:{1}]-*(\\)+|\\(+|\\]+|\\[+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(smiles);
        int count = 0;
        while (matcher.find()) {
            System.out.println(smiles.substring(matcher.start(), matcher.end()));
            count++;
        }
        System.out.println("Количество смайликов в строке = " + count);
    }

}
