package tasksIncapsulation;

/**
 * Описать базовый класс MainString (Строка).
 * Обязательные поля класса:
 * - массив символов;
 * - значение типа int хранит длину строки в символах.
 * Реализовать обязательные методы следующего назначения:
 * - конструктор без параметров;
 * - конструктор, принимающий в качестве параметра строковый литерал;
 * - конструктор, принимающий в качестве параметра символ;
 * - метод получения длины строки;
 * - метод очистки строки (делает строку пустой);
 * - метод поиска символа в строке.
 */
public class MainString {
    char[] characters;
    int stringLength;

    public MainString() {
        stringLength = 0;
    }

    public MainString(String string) {
        stringLength = string.length();
        characters = new char[stringLength];
        for (int i = 0; i < stringLength; i++) {
            characters[i] = string.charAt(i);
        }
    }

    public MainString(char character) {
        stringLength = 1;
        characters = new char[1];
        characters[0] = character;
    }

    public int getStringLength() {
        return stringLength;
    }

    public void flush() {
        stringLength = 0;
        characters = new char[0];
    }

    public boolean findChar(char character) {
        for (char c : characters) {
            if (c == character) {
                return true;
            }
        }
        return false;
    }

}
