package tasksList;

import java.util.List;
import java.util.Scanner;

public class Console {
    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public int inputInt() {
        return scanner.nextInt();
    }

    public void inputToList(List<Integer> list, int toSize) {
        while (list.size() < toSize) {
            list.add(scanner.nextInt());
        }
    }

    public String inputString(boolean cleanBuffer) {
        if (!cleanBuffer) {
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public void printLine(String line) {
        System.out.println(line);
    }
}
