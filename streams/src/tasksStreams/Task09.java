package tasksStreams;

import model.Phone;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Практика 9
 * исправь пример, чтобы он выводил только самые дорогие телефоны
 * каждого производителя
 */
public class Task09 {
    public static void main(String[] args) {
        Map<String, Optional<Phone>> collected = Phone.getPhones()
                .collect(Collectors.groupingBy(Phone::getProducer, Collectors.maxBy(Comparator.comparing(Phone::getPrice))));

        collected.forEach((key, value) -> {
            if (value.isPresent()) {
                System.out.println(value);
            }
        });
    }
}
