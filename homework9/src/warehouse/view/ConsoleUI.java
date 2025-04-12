package warehouse.view;

import warehouse.controller.Controller;
import warehouse.controller.ControllerImpl;
import warehouse.model.Item;
import warehouse.model.Waybill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View {
    private final Scanner scanner;
    private final Controller controller;
    private final Menu menu;
    private String currentAddress;
    private boolean exit;

    private void establishInitial() {
        System.out.println("Введите адрес склада:");
        String legalAddress = scanner.nextLine();
        controller.establishWarehouse(legalAddress);
        currentAddress = legalAddress;
    }

    private void fillItemsWaybill(List<Item> itemList) {
        boolean filling = true;
        while (filling) {
            System.out.println("1 - Ввести товар, 2 - Завершить ввод.");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Номер по накладной");
                int number = scanner.nextInt();
                System.out.println("Имя товара");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Ед. изм.");
                String unit = scanner.nextLine();
                System.out.println("Количество");
                int quantity = scanner.nextInt();
                System.out.println("Цена");
                int price = scanner.nextInt();
                itemList.add(new Item(number, name, unit, quantity, price));
            } else {
                filling = false;
            }
        }
    }

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        controller = new ControllerImpl(this);
        menu = new Menu(this);
        exit = false;
    }

    public void run() {
        establishInitial();
        while (!exit) {
            System.out.println(menu.printMenu());
            execute();
        }
    }

    private void execute() {
        int numMenu = scanner.nextInt();
        menu.execute(numMenu);
    }

    @Override
    public void printAnswer(String info) {
        System.out.println(info);
    }

    public void displayOuterAddresses() {
        controller.displayOuterAddresses(currentAddress);
    }

    public void displayStoredItems() {
        controller.displayStored(currentAddress);
    }

    public void exitProgram() {
        exit = true;
    }

    public void inputWaybill() {
        System.out.println("Дата накладной");
        scanner.nextLine();
        String date = scanner.nextLine();
        System.out.println("От кого");
        String addressReleased = scanner.nextLine();
        System.out.println("Основание");
        String basis = scanner.nextLine();
        System.out.println("Доверенность, номер");
        String proxyNumber = scanner.nextLine();
        System.out.println("Доверенность, дата");
        String proxyDate = scanner.nextLine();
        System.out.println("Отправил, ФИО");
        String releaserName = scanner.nextLine();
        System.out.println("Получил, ФИО");
        String receiverName = scanner.nextLine();
        List<Item> itemList = new ArrayList<>();
        fillItemsWaybill(itemList);
        Waybill waybill = new Waybill(date, addressReleased, currentAddress, basis, proxyNumber,
                proxyDate, releaserName, receiverName, itemList);
        controller.addWaybill(currentAddress, waybill);
    }

    public void establishWarehouse() {
        scanner.nextLine();
        System.out.println("Введите адрес:");
        String legalAddress = scanner.nextLine();
        controller.establishWarehouse(legalAddress);
    }

    public void searchProductByName() {
        scanner.nextLine();
        System.out.println("Введите имя товара:");
        String productName = scanner.nextLine();
        controller.searchProductByName(currentAddress, productName);
    }
}
