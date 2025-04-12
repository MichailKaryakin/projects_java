package homework;

public class Task10 {
    public static void main(String[] args) {
        final int WEIGHT = 70;
        final int HEIGHT = 185;

        int idealWeight = HEIGHT - 110;
        int desirableIncome = idealWeight - WEIGHT;

        if (desirableIncome > 0) {
            System.out.printf("Get some additional %d kg of weight.", desirableIncome);
        } else {
            System.out.printf("Take off some %d kg off your weight.", -desirableIncome);
        }
    }
}
