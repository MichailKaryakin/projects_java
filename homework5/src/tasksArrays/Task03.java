package tasksArrays;

/**
 * Написать программу, которая проверяет,
 * все ли значения элементов массива одинаковые.
 * Вывести: Yes – если все одинаковы
 * и No – если имеется хоть одно различие.
 * Массив задается и инициализируется в начале программы.
 */
public class Task03 {
    public static void main(String[] args) {
        int[] array = {19, 19, 9, 19, 19};
        if (isConsistent(array)) {
            System.out.println("Yes, Yes, Yes. Yes!");
        } else {
            System.out.println("No, No, No. No!");
        }
    }

    public static boolean isConsistent(int[] array) {
        boolean consistency = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                consistency = false;
                break;
            }
        }
        return consistency;
    }

}
