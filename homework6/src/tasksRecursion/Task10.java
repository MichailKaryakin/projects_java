package tasksRecursion;

/**
 * Написать рекурсивный статический метод нахождения
 * наибольшего общего делителя двух целых чисел.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(greatestCommonDiv(10, 15));
    }

    public static int greatestCommonDiv(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            return greatestCommonDiv(secondNumber, firstNumber % secondNumber);
        } else {
            return firstNumber;
        }
    }

}
