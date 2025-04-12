package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class DisplayOuter extends Command {
    public DisplayOuter(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Внешние адреса";
    }

    @Override
    public void execute() {
        consoleUi.displayOuterAddresses();
    }
}
