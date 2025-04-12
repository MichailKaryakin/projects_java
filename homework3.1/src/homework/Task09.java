package homework;

public class Task09 {
    public static void main(String[] args) {
        final int X_0 = 4;
        final int Y_0 = 4;
        final int X_1 = 10;
        final int Y_1 = 10;

        if (((Y_0 - Y_1) > 0) && ((X_0 - X_1) > 0)) {
            System.out.println("Rise");
        } else if (((Y_0 - Y_1) > 0) && ((X_0 - X_1) < 0)) {
            System.out.println("Descent");
        } else if (((Y_0 - Y_1) < 0) && ((X_0 - X_1) > 0)) {
            System.out.println("Descent");
        } else if (((Y_0 - Y_1) < 0) && ((X_0 - X_1) < 0)) {
            System.out.println("Rise");
        } else if (((Y_0 - Y_1) == 0) && ((X_0 - X_1) != 0)) {
            System.out.println("Straight line");
        } else if (((Y_0 - Y_1) != 0) && ((X_0 - X_1) == 0)) {
            System.out.println("Steep line");
        } else {
            System.out.println("That's just a dot");
        }
    }
}
