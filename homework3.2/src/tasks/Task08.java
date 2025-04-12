package tasks;

public class Task08 {
    public static void main(String[] args) {
        int number = 2136;
        int changedNumber = clearGivenBit(number, oldestBinaryRank(number));

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Бит старшего разряда обнулён: ");
        printToBinary(changedNumber);
    }

    private static int clearGivenBit(int number, int bitNumber) {
        return number & ~(1 << bitNumber);
    }

    private static int oldestBinaryRank(int number) {
        double toPowerOf = 0;
        while (number > (Math.pow(2, toPowerOf))) {
            toPowerOf++;
        }
        return (int) toPowerOf - 1;
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%20s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

}
