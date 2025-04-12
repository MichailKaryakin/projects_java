package tasksMap;

import tasksList.Console;

import java.util.HashMap;
import java.util.Map;

public class Operations {
    private final HashMap<String, String> loginPassword;
    private final Console console;

    public Operations() {
        loginPassword = new HashMap<>();
        console = new Console();
    }

    public void addUser() {
        console.printLine("Введите логин пользователя:");
        String login = console.inputString(true);
        console.printLine("Введите пароль пользователя:");
        String password = console.inputString(true);
        loginPassword.put(login, password);
    }

    public void deleteUser() {
        console.printLine("Введите логин пользователя:");
        String login = console.inputString(true);
        loginPassword.remove(login);
    }

    public void doesUserExist() {
        console.printLine("Введите логин пользователя:");
        String login = console.inputString(true);
        if (loginPassword.containsKey(login)) {
            System.out.println("Существует");
        } else {
            System.out.println("Не существует");
        }
    }

    public void changeLogin() {
        console.printLine("Введите логин пользователя, который хотите поменять:");
        String login = console.inputString(true);
        console.printLine("Введите новый логин:");
        String newLogin = console.inputString(true);
        String password = loginPassword.get(login);
        loginPassword.remove(login);
        loginPassword.put(newLogin, password);
    }

    public void changePassword() {
        console.printLine("Введите логин пользователя, для которого хотите поменять пароль:");
        String login = console.inputString(true);
        console.printLine("Введите новый пароль пользователя:");
        String password = console.inputString(true);
        loginPassword.replace(login, password);
    }

    public void displayMap() {
        for (Map.Entry<String, String> entry : loginPassword.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
