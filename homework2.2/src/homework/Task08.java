package homework;

public class Task08 {
    public static void main(String[] args) {
        final int SPEED_OF_SOUND = 343;
        final int TIME_PASSED = 10;

        int distance = SPEED_OF_SOUND * TIME_PASSED;

        System.out.printf("Measured distance according to the passed %d seconds is: %d metres.", TIME_PASSED, distance);
    }
}
