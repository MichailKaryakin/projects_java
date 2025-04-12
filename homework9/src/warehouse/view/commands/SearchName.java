package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class SearchName extends Command {
    public SearchName(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Товар по имени";
    }

    @Override
    public void execute() {
        consoleUi.searchProductByName();
    }
}
