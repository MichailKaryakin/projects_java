package homework;

public class Task11 {
    public static void main(String[] args) {
        final int TIME_TO_NEW_YEAR = 191919;

        System.out.printf("""
                Ho-ho-ho. Christmas is coming in... %d seconds.
                Wait, I ain't understand a thing like that. Santa needs your help!
                """, TIME_TO_NEW_YEAR);

        int[] arrayForSanta = new int[4];
        decomposeSeconds(arrayForSanta, TIME_TO_NEW_YEAR);
    }

    public static void decomposeSeconds(int[] array, int seconds) {
        toDays(array, seconds);
        System.out.printf("\nAnd we got it! Christmas is coming in %d days, %d hours, %d minutes and %d seconds.",
                array[0], array[1], array[2], array[3]);
    }

    public static void toDays (int[] array, int seconds) {
        int days = seconds / 86400;
        array[0] = days;
        seconds -= days * 86400;
        toHours(array, seconds);
    }

    public static void toHours (int[] array, int seconds) {
        int hours = seconds / 3600;
        array[1] = hours;
        seconds -= hours * 3600;
        toMinutes(array, seconds);
    }

    public static void toMinutes (int[] array, int seconds) {
        int minutes = seconds / 60;
        array[2] = minutes;
        seconds -= minutes * 60;
        array[3] = seconds;
    }
}
