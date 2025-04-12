package homework;

public class Task04 {
    public static void main(String[] args) {
        final int x = 12;
        final int y = 7;

        if (x > 0 && y > 0) {
            System.out.println("First quarter");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quarter");
        } else if (x == 0 && y == 0) {
            System.out.println("Central point");
        } else if (x != 0 && y == 0) {
            System.out.println("On the Y axis");
        } else if (x == 0 && y != 0) {
            System.out.println("On the X axis");
        }
    }
}
