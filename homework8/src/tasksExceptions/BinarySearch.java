package tasksExceptions;

/**
 * Класс с методом бинарного поиска
 */
public class BinarySearch {
    public static int binarySearch(int[] list, int item) throws UnsortedArrayException {
        if (isListEmpty(list) & !isSorted(list)) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guessEqualsItem(guess, item)) {
                return mid;
            } else if (guessGreaterThanItem(guess, item)) {
                high = mid - 1;
            } else if (guessLessThanItem(guess, item)) {
                low = mid + 1;
            }
        }

        return -1;
    }

    private static boolean isSorted(int[] list) throws UnsortedArrayException {
        for (int i = 0; i < list.length - 1; i++) {
            if (!(list[i] < list[i + 1])) {
                throw new UnsortedArrayException("Массив не отсортирован");
            }
        }
        return true;
    }

    private static boolean isListEmpty(int[] myList) {
        int listSize = myList.length;
        return listSize == 0;
    }

    private static boolean guessEqualsItem(int guess, int item) {
        return guess == item;
    }

    private static boolean guessGreaterThanItem(int guess, int item) {
        return guess >= item;
    }

    private static boolean guessLessThanItem(int guess, int item) {
        return guess <= item;
    }
}
