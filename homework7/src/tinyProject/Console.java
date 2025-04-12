package tinyProject;

import java.util.Scanner;

public class Console {
    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public int inputInt() {
        return scanner.nextInt();
    }

    public String inputString() {
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public void printLine(String line) {
        System.out.println(line);
    }
}
