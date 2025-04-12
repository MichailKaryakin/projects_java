package tasksInheritance.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать базовый класс «Устройство» и производные
 * классы «Чайник», «Микроволновка», «Автомобиль»,
 * «Пароход». С помощью конструктора установить имя
 * каждого устройства и его характеристики.
 * Реализуйте для каждого из классов методы:
 * - Sound — издает звук устройства (пишем текстом в
 * консоль);
 * - Show — отображает название устройства;
 * - Desc — отображает описание устройства.
 */
public class Task01 {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Device> deviceList;

    public Task01() {
        deviceList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Task01 task01 = new Task01();
        task01.menu();
    }

    public void menu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("1 - добавить чайник, 2 - добавить микроволновку, 3 - добавить параход, " +
                    "4 - добавить автомобиль, 5 - исполнение методов, 6 - выход");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Введите имя, мощность и цвет");
                deviceList.add(new Kettle(lineAfterInt(), scanner.nextInt(), lineAfterInt()));
            } else if (userChoice == 2) {
                System.out.println("Введите имя, мощность и цвет");
                deviceList.add(new Microwave(lineAfterInt(), scanner.nextInt(), lineAfterInt()));
            } else if (userChoice == 3) {
                System.out.println("Введите имя, водоизмещение и максимум людей в экипаже");
                deviceList.add(new Steamboat(lineAfterInt(), scanner.nextInt(), scanner.nextInt()));
            } else if (userChoice == 4) {
                System.out.println("Введите имя, максимальную скорость и цвет");
                deviceList.add(new Automobile(lineAfterInt(), scanner.nextInt(), lineAfterInt()));
            } else if (userChoice == 5) {
                execute();
            } else {
                exit = true;
            }
        }
        scanner.close();
    }

    private void execute() {
        for (Device device : deviceList) {
            System.out.println("Методы объекта:");
            device.sound();
            device.show();
            device.desc();
            System.out.println();
        }
    }

    private String lineAfterInt() {
        scanner.nextLine();
        return scanner.nextLine();
    }
}
