package tasksIncapsulation;

/**
 * Класс, реализующий диапазон двух целых чисел.
 */
public class Range {
    private final int beginValue;
    private final int endValue;

    public Range(int begin, int end) {
        beginValue = begin;
        endValue = end;
    }

    public boolean check() {
        return beginValue <= endValue;
    }

    public int length() {
        return endValue - beginValue;
    }

    private boolean hasValue(int value) {
        for (int i = beginValue; i <= endValue; i++) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public boolean crossingCheck(Range anotherRange) {
        for (int i = anotherRange.beginValue; i <= anotherRange.endValue; i++) {
            if (hasValue(i)) {
                return true;
            }
        }
        return false;
    }

}
