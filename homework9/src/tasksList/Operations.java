package tasksList;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    private final List<Integer> list;
    private final Console console;

    public Operations() {
        list = new ArrayList<>();
        console = new Console();
    }

    public void initList() {
        console.printLine("Введите 5 чисел:");
        console.inputToList(list, 5);
    }

    public void addElement() {
        console.printLine("Введите число:");
        list.add(console.inputInt());
    }

    public void deleteElement() {
        console.printLine("Введите индекс:");
        list.remove(console.inputInt());
    }

    public void displayList() {
        console.printLine(list.toString());
    }

    public void checkForValue() {
        console.printLine("Введите число:");
        if (list.contains(console.inputInt())) {
            console.printLine("Число присутствует в списке");
        } else {
            console.printLine("Значения нет в списке");
        }
    }

    public void replaceValue() {
        console.printLine("Введите индекс:");
        int index = console.inputInt();
        console.printLine("Введите новое значение:");
        list.set(index, console.inputInt());
    }
}
