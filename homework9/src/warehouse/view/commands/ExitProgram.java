package warehouse.view.commands;

import warehouse.view.ConsoleUI;

public class ExitProgram extends Command {
    public ExitProgram(ConsoleUI consoleUi) {
        super(consoleUi);
        menuText = "Выход";
    }

    @Override
    public void execute() {
        consoleUi.exitProgram();
    }
}
