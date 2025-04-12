package warehouse.view;

import warehouse.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Command> commands;

    public Menu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new NewWarehouse(consoleUI));
        commands.add(new InputWaybill(consoleUI));
        commands.add(new DisplayStored(consoleUI));
        commands.add(new DisplayOuter(consoleUI));
        commands.add(new SearchName(consoleUI));
        commands.add(new ExitProgram(consoleUI));
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder
                    .append(i + 1)
                    .append(" - ")
                    .append(commands.get(i).getMenuText());
            if ((i + 1) != commands.size()) {
                stringBuilder.append(", ");
            } else {
                stringBuilder.append(".");
            }
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }
}
