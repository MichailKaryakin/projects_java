package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class NewWarehouse extends Command {
    public NewWarehouse(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Добавить склад в сеть";
    }

    @Override
    public void execute() {
        consoleUi.establishWarehouse();
    }
}
