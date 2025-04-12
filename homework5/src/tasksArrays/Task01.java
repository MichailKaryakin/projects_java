package tasksArrays;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 */
public class Task01 {

    public static void pause() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] fibonacciArray = new int[15];
        fillFibonacciArray(fibonacciArray, fibonacciArray.length);
        printFibonacciArray(fibonacciArray, fibonacciArray.length);
        altPrintFibonacciArray(fibonacciArray, fibonacciArray.length);
    }

    public static void fillFibonacciArray(int[] array, int range) {
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < range; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
    }

    public static void printFibonacciArray(int[] array, int range) {
        pause();
        System.out.println("Предположим, что чётными элементами подразумеваются элементы с чётным индексом");
        pause();
        for (int i = 0; i < range; i += 2) {
            System.out.println("Чётный элемент (индекс " + i + "): " + array[i]);
            pause();
        }
        System.out.println();
    }

    public static void altPrintFibonacciArray(int[] array, int range) {
        System.out.println("Предположим, что чётными элементами подразумеваются собственно чётные числа массива");
        pause();
        for (int i = 0; i < range; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Чётный элемент (индекс " + i + "): " + array[i]);
                pause();
            }
        }
    }

}
