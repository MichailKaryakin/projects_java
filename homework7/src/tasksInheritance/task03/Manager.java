package tasksInheritance.task03;

public class Manager extends Worker {
    @Override
    void Print() {
        System.out.println("Выполняет обязанности менеджера");
    }
}
