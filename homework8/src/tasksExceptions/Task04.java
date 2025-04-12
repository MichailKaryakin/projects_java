package tasksExceptions;

/**
 * Напишите метод бинарного поиска в одномерном массиве.
 * В случае, если массив не отсортирован, метод должен
 * бросать проверяемое исключение.
 */
public class Task04 {
    public static void main(String[] args) {
        int[] testArray = {1, 4, 7, 6, 10, 12, 15};
        try {
            int result = BinarySearch.binarySearch(testArray, 7);
            System.out.println("Найдено, индекс: " + result);
        } catch (UnsortedArrayException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
