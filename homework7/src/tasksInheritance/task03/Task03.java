package tasksInheritance.task03;

/**
 * Создать абстрактный базовый класс Worker
 * (работника) с методом Print(). Создайте четыре производных
 * класса: President, Security, Manager, Engineer.
 * Переопределите метод.
 * Print() для вывода информации, соответствующей
 * каждому типу работника.
 */
public class Task03 {
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        Manager manager = new Manager();
        President president = new President();
        Security security = new Security();

        engineer.Print();
        manager.Print();
        president.Print();
        security.Print();
    }

}
