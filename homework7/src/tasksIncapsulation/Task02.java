package tasksIncapsulation;

/**
 * Для задания 1 добавить возможность проверки,
 * пересекаются ли различные диапазоны значений.
 */
public class Task02 {
    public void checkCrossings(Range firstRange, Range secondRange) {
        if (firstRange.crossingCheck(secondRange)) {
            System.out.println("Диапазоны пересекаются");
        } else {
            System.out.println("Диапазоны не пересекаются");
        }
    }

}
