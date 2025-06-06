package warehouse;

import warehouse.view.ConsoleUI;

/**
 * В компании XXX есть несколько складов с продукцией,
 * каждый склад имеет свой собственный юридический адрес.
 * Регистрация поступления или отгрузки товаров осуществляется
 * по накладной (документ). Товары могут поступать
 * как от внешних поставщиков, так и перемещаться между
 * складами компании.
 * <p>
 * Задача – разработать программу складского учета.
 * Программа должна:
 * - содержать форму ввода накладной;
 * - выводить список всех товаров на складе;
 * - выводить список всех внешних поставщиков;
 * - искать товар на складе по наименованию.
 */
public class Entry {
    public static void main(String[] args) {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.run();
    }
}
