package tasksExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

/**
 * Создайте метод, который принимает массив объектов
 * данного класса, и вызывает у каждого объекта метод read.
 * Если при исполнении будет брошено исключение
 * FileSystemAlreadyExistsException, поймать исключение и
 * бросить исключение FileNotFoundException.
 */
public class Task06 {
    public static void main(String[] args) throws IOException {
        XmlReader[] objectArray = {new XmlReader(), new XmlReader(), new XmlReader()};
        Task06 task06 = new Task06();
        task06.goThrough(objectArray);
    }

    private void goThrough(XmlReader[] objectArray) throws IOException {
        for (XmlReader xmlReader : objectArray) {
            try {
                xmlReader.read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            }
        }
    }
}
