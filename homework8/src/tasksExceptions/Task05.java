package tasksExceptions;

import java.io.IOException;

/**
 * Напишите код, который создает объекты данного класса
 * и вызывает метод halt. В случае, если в методе было брошено
 * RuntimeException, вывести в консоль halt;
 * в противном случае – пробросить исключение наверх.
 */
public class Task05 {
    public static void main(String[] args) throws IOException {
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();

        try {
            runner1.halt();
            runner2.halt();
            runner3.halt();
        } catch (RuntimeException e) {
            System.out.println("halt");
        } catch (IOException e) {
            throw new IOException();
        }
    }
}
