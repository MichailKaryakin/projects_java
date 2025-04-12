package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class InputWaybill extends Command {
    public InputWaybill(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Ввести накладную";
    }

    @Override
    public void execute() {
        consoleUi.inputWaybill();
    }
}
