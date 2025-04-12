package tasksMap;

import tasksList.Console;

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
        while (!exit) {
            int userChoice;
            console.printLine("""
                    1 - Добавить пользователя, 2 - Удалить пользователя, 3 - Существует ли пользователь,
                    4 - Изменить логин пользователя, 5 - Изменить пароль пользователя, 6 - Отобразить данные,
                    7 - Выход.
                    """);
            userChoice = console.inputInt();
            if (userChoice == 1) {
                operations.addUser();
            } else if (userChoice == 2) {
                operations.deleteUser();
            } else if (userChoice == 3) {
                operations.doesUserExist();
            } else if (userChoice == 4) {
                operations.changeLogin();
            } else if (userChoice == 5) {
                operations.changePassword();
            } else if (userChoice == 6) {
                operations.displayMap();
            } else {
                exit = true;
            }
        }
    }
}
