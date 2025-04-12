package tasks;

public class Task06 {
    public static void main(String[] args) {
        int number = 8191;
        int numLeftUntouchedBits = 3;
        int changedNumber = clearNumerousBits(number, numLeftUntouchedBits);

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Все биты, начиная с позиции " + numLeftUntouchedBits + " обнулены: ");
        printToBinary(changedNumber);
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%20s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

    private static int clearGivenBit(int number, int bitNumber) {
        return number & ~(1 << bitNumber);
    }

    private static int clearNumerousBits(int number, int notToChange) {
        for (int i = notToChange; i <= oldestBinaryRank(number); i++) {
            number = clearGivenBit(number, i);
        }
        return number;
    }

    private static int oldestBinaryRank(int number) {
        double toPowerOf = 0;
        while (number > (Math.pow(2, toPowerOf))) {
            toPowerOf++;
        }
        return (int) toPowerOf - 1;
    }

}
