package homework;

public class Task07 {
    public static void main(String[] args) {
        final int PERCENT = 10;
        final int DEPOSIT = 100000;
        final int TERM = 2;

        double resultingAmount = DEPOSIT * pow((((double) PERCENT / 100) + 1), TERM);

        System.out.printf("Amount of deposit (after %d years) will make up for a: %.3f USD.", TERM, resultingAmount);
    }

    public static double pow(double value, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
