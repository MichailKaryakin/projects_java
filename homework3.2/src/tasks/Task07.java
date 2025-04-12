package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        int number = 63;
        int numOfBit = 5;

        List<Integer> binaryFromTail = new ArrayList<>(1024);
        fillBinaryListFromTail(number, binaryFromTail);

        if (binaryFromTail.get(numOfBit) == 1) {
            System.out.println("Значение бита равно единице ");
        } else {
            System.out.println("Значение бита равно нулю ");
        }
    }

    public static void fillBinaryListFromTail(int number, List<Integer> binaryList) {
        if (number < 1) {
            return;
        } else {
            if (number % 2 == 0) {
                binaryList.add(0);
            } else {
                binaryList.add(1);
            }
            fillBinaryListFromTail(number / 2, binaryList);
        }
    }

}
