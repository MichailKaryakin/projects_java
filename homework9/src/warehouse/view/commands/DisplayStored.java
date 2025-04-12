package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class DisplayStored extends Command {
    public DisplayStored(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Список хранимого";
    }

    @Override
    public void execute() {
        consoleUi.displayStoredItems();
    }
}
