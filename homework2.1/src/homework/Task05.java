package homework;

public class Task05 {

    public static void main(String[] args) {
        final double radius = 10.5;

        double area = Math.PI * (radius * radius);
        double circumference = Math.PI * 2 * radius;

        System.out.printf("Площадь окружности равна: %.3f\n", area);
        System.out.printf("Длина окружности равна: %.3f",circumference);
    }

}
