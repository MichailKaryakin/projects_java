package tasksGenerics;

import tinyProject.Console;

/**
 * Песочница для тестирования работы массива.
 * Использует тип String.
 */
public class Playground {
    MyList<String> myList;
    private final Console console;

    public Playground() {
        this.myList = new MyArrayList<>();
        console = new Console();
    }

    public static void main(String[] args) {
        Playground playground = new Playground();
        playground.menu();
        playground.console.closeScanner();
    }

    public void menu() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Геттер, 2 - Методы вставки, 3 - Методы удаления,
                    4 - Получение индекса, 5 - Элемент по индексу, 6 - Пуст ли массив,
                    7 - Смена порядка элементов, 8 - Обрезать лишнюю память, 9 - Вывод массива строкой,
                    10 - Выход.
                    """);
            userChoice = console.inputInt();
            switch (userChoice) {
                case 1 -> console.printLine("Размер массива на текущий момент: " + myList.getSize());
                case 2 -> insertion();
                case 3 -> deletion();
                case 4 -> getIndex();
                case 5 -> getElement();
                case 6 -> console.printLine(String.valueOf(myList.isEmpty()));
                case 7 -> changeOrder();
                case 8 -> myList.trimToSize();
                case 9 -> console.printLine(myList.toString());
                default -> exit = true;
            }
        }
    }

    public void insertion() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Push Back, 2 - Push Front, 3 - Insert, 4 - Выход.
                    """);
            userChoice = console.inputInt();
            if (userChoice == 1) {
                console.printLine("Введите элемент:");
                String string = console.inputString();
                myList.pushBack(string);
            } else if (userChoice == 2) {
                console.printLine("Введите элемент:");
                String string = console.inputString();
                myList.pushFront(string);
            } else if (userChoice == 3) {
                console.printLine("Введите индекс:");
                int index = console.inputInt();
                console.printLine("Введите элемент:");
                String string = console.inputString();
                myList.insert(string, index);
            } else {
                exit = true;
            }
        }
    }

    public void deletion() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Pop Front, 2 - Pop Back, 3 - Remove At, 4 - Remove, 5 - Remove All,
                    6 - Clear, 7 - Выход.
                    """);
            userChoice = console.inputInt();
            switch (userChoice) {
                case 1 -> console.printLine("Удалённый элемент: " + myList.popFront());
                case 2 -> console.printLine("Удалённый элемент: " + myList.popBack());
                case 3 -> {
                    console.printLine("Введите индекс:");
                    int index = console.inputInt();
                    myList.removeAt(index);
                }
                case 4 -> {
                    console.printLine("Введите элемент:");
                    String element = console.inputString();
                    myList.remove(element);
                }
                case 5 -> {
                    console.printLine("Введите элемент:");
                    String element = console.inputString();
                    myList.removeAll(element);
                }
                case 6 -> myList.clear();
                default -> exit = true;
            }
        }
    }

    public void getIndex() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Первый, 2 - Последний, 3 - Выход.
                    """);
            userChoice = console.inputInt();
            if (userChoice == 1) {
                console.printLine("Введите элемент:");
                String element = console.inputString();
                console.printLine("Индекс: " + myList.indexOf(element));
            } else if (userChoice == 2) {
                console.printLine("Введите элемент:");
                String element = console.inputString();
                console.printLine("Индекс: " + myList.lastIndexOf(element));
            } else {
                exit = true;
            }
        }
    }

    public void getElement() {
        console.printLine("Введите индекс элемента:");
        int index = console.inputInt();
        String element = myList.getElementAt(index);
        if (element != null) {
            console.printLine("Элемент по индексу: " + element);
        }
    }

    public void changeOrder() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Reverse, 2 - Shuffle, 3 - Выход.
                    """);
            userChoice = console.inputInt();
            if (userChoice == 1) {
                myList.reverse();
            } else if (userChoice == 2) {
                myList.shuffle();
            } else {
                exit = true;
            }
        }
    }
}
