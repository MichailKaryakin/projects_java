package tasksArrays;

/**
 * Написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно повторение.
 * Массив задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void pause() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 9, 99, 199};
        if (isDiverse(array)) {
            System.out.println("Yes, elements are totally diverse ");
        } else {
            System.out.println("No, there are duplicates, at least one ");
        }
    }

    public static boolean isDiverse(int[] array) {
        boolean diversity = true;
        pause();
        System.out.println("Печально, но придётся провести простой поиск для каждого элемента =( ");
        pause();
        System.out.println("Не обижайтесь на меня, бедную функцию, если массив слишком большой... ");
        pause();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    diversity = false;
                    break;
                }
            }
        }
        return diversity;
    }

}
