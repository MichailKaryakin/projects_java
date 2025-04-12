package tasksExceptions;

/**
 * Класс треугольник с неизменяемыми объектами
 */
public final class Triangle {
    int aSide;
    int bSide;
    int cSide;

    public Triangle(int aSide, int bSide, int cSide) {
        try {
            if (doesExist(aSide, bSide, cSide)) {
                this.aSide = aSide;
                this.bSide = bSide;
                this.cSide = cSide;
            }
        } catch (InvalidTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private boolean doesExist(int a, int b, int c) throws InvalidTriangleException {
        boolean condition = (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
        if (!condition) {
            throw new InvalidTriangleException("Треугольник не существует");
        }
        return true;
    }
}
