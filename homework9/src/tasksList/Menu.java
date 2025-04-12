package tasksList;

public class Menu {
    private boolean exit;
    private final Console console;
    private final Operations operations;

    public Menu() {
        exit = false;
        console = new Console();
        operations = new Operations();
    }

    public void menuCycle() {
        operations.initList();
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Добавить элемент, 2 - Удалить элемент, 3 - Показать список,
                    4 - Проверить наличие значения, 5 - Заменить значение, 6 - Выход.
                    """);
            userChoice = console.inputInt();
            if (userChoice == 1) {
                operations.addElement();
            } else if (userChoice == 2) {
                operations.deleteElement();
            } else if (userChoice == 3) {
                operations.displayList();
            } else if (userChoice == 4) {
                operations.checkForValue();
            } else if (userChoice == 5) {
                operations.replaceValue();
            } else {
                exit = true;
            }
        }
    }
}
