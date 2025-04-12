package homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        final int NUM_OF_DISCIPLES = 100;

        System.out.println("pick the scenario: 1 - 100%, 2 - 60%, 3 - 1%");

        Scanner scanner = new Scanner(System.in);
        int scenarioId = scanner.nextInt();

        if (scenarioId == 1) {
            firstScenario(NUM_OF_DISCIPLES);
        } else if (scenarioId == 2) {
            secondScenario(NUM_OF_DISCIPLES);
        } else if (scenarioId == 3) {
            thirdScenario(NUM_OF_DISCIPLES);
        } else {
            System.out.println("very smart, run the thing again, when not in the funny mood");
        }
    }

    public static void firstScenario(int numOfDisciples) {
        int specificNumber = (numOfDisciples * 100) / 100;
        milkPieCalculate(numOfDisciples, specificNumber);
    }

    public static void secondScenario(int numOfDisciples) {
        int specificNumber = (numOfDisciples * 60) / 100;
        milkPieCalculate(numOfDisciples, specificNumber);
    }

    public static void thirdScenario(int numOfDisciples) {
        int specificNumber = numOfDisciples / 100;
        milkPieCalculate(numOfDisciples, specificNumber);
    }

    private static void milkPieCalculate(int numOfDisciples, int specificNumber) {
        int adjacentNumber = numOfDisciples - specificNumber;

        int piesReq = (specificNumber * 2) + adjacentNumber;
        double milkMlReq = specificNumber * 200;

        int milkReq = (int) Math.ceil(milkMlReq / 900);
        System.out.printf("you're gonna need %d package(s) of milk and %d pie(s)", milkReq, piesReq);
    }
}
