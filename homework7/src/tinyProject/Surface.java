package tinyProject;

import java.util.ArrayList;
import java.util.List;

public class Surface {
    private final Console console;
    private final EmployeeList employeeList;
    private final File file;

    public Surface() {
        file = new File("");
        console = new Console();
        employeeList = new EmployeeList();
        setupList();
    }

    private void setupList() {
        employeeList.setEmployeeList(file.parseData());
    }

    public void start() {
        menu();
        console.closeScanner();
    }

    private void menu() {
        boolean exit = false;
        while (!exit) {
            int userChoice;
            console.printLine("1 - Ввести данные, 2 - Вывести таблицу, 3 - Выход");
            userChoice = console.inputInt();
            if (userChoice == 1) {
                manipulateData();
            } else if (userChoice == 2) {
                getTable();
            } else if (userChoice == 3) {
                exit = true;
            } else {
                console.printLine("Нет такой опции");
            }
        }
    }

    private void manipulateData() {
        askForARecord(employeeList.getEmployeeList());
        file.loadData(employeeList.getEmployeeList());
    }

    private void getTable() {
        Table table = new Table();
        table.printTable(employeeList.getEmployeeList());
    }

    private void askForARecord(List<Employee> employeeList) {
        console.printLine("""
                Просим обратить внимание, пользователь.
                При введении уже существующих в базе ФИО, работник будет перезаписан.
                Спасибо за внимание.
                """);
        console.printLine("Тип оплаты сотрудника: 1 - ставка, 2 - почасовая, 3 - сдельная");
        int userChoice;
        userChoice = console.inputInt();

        if (userChoice == 1) {
            console.printLine("Введите ФИО, ставку за день и количество отработанных дней");
            String nameAndInitials = console.inputString();

            if (this.employeeList.existsInList(nameAndInitials, employeeList)) {
                employeeList.removeIf(nextEmployee -> nextEmployee.getNameAndInitials().equals(nameAndInitials));
                employeeList.add(new OnWage(console.inputInt(), console.inputInt(), nameAndInitials));
            } else {
                employeeList.add(new OnWage(console.inputInt(), console.inputInt(), nameAndInitials));
            }
        } else if (userChoice == 2) {
            console.printLine("Введите ФИО, ставку за час и количество отработанных часов");
            String nameAndInitials = console.inputString();

            if (this.employeeList.existsInList(nameAndInitials, employeeList)) {
                employeeList.removeIf(nextEmployee -> nextEmployee.getNameAndInitials().equals(nameAndInitials));
                employeeList.add(new OnHourly(console.inputInt(), console.inputInt(), nameAndInitials));
            } else {
                employeeList.add(new OnHourly(console.inputInt(), console.inputInt(), nameAndInitials));
            }
        } else if (userChoice == 3) {
            console.printLine("Введите ФИО, количество оплат, а затем последовательно все оплаты");
            String nameAndInitials = console.inputString();
            int numOfPayments = console.inputInt();
            List<Integer> payments = new ArrayList<>();

            while (numOfPayments != 0) {
                int payment = console.inputInt();
                payments.add(payment);
                numOfPayments--;
            }

            if (this.employeeList.existsInList(nameAndInitials, employeeList)) {
                employeeList.removeIf(nextEmployee -> nextEmployee.getNameAndInitials().equals(nameAndInitials));
                employeeList.add(new OnPiecework(payments, nameAndInitials));
            } else {
                employeeList.add(new OnPiecework(payments, nameAndInitials));
            }
        } else {
            console.printLine("Нет такой опции");
        }
    }
}
