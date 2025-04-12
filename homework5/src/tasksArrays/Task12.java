package tasksArrays;

/**
 * Программа должна выводить слово Yes для симметричного массива
 * и слово No – для несимметричного. Симметричным считается массив,
 * в котором значения элементов с конца равно значению элементов с начала.
 * Массив задается и инициализируется в начале программы.
 */
public class Task12 {
    public static void main(String[] args) {
        int[] array = {12, 24, 31, 24, 12};
        if (checkPalindrome(array)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean checkPalindrome(int[] array) {
        boolean fineForNow = true;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if (!(array[i] == array[j])) {
                fineForNow = false;
                break;
            }
        }
        return fineForNow;
    }

}
