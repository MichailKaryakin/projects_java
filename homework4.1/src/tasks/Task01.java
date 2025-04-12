package tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Показать на экране все числа Фибоначчи в диапазоне от
 * 0 до 10 000 000.
 */
public class Task01 {
    public static void main(String[] args) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        for (int i = 1; fibonacciNumbers.get(i) < 10_000_000; i++) {
            int currentNumber = fibonacciNumbers.get(i);
            int priorNumber = fibonacciNumbers.get(i - 1);
            fibonacciNumbers.add(currentNumber + priorNumber);
        }
        fibonacciNumbers.removeLast();
        for (Integer fibonacciNumber : fibonacciNumbers) {
            System.out.println(fibonacciNumber);
        }
    }

}
