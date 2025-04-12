package tasks;

public class Task01 {
    public static void main(String[] args) {
        int numOfBit = 0;
        int number = 15;
        int changedNumber = clearGivenBit(number, numOfBit);

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Бит в позиции " + numOfBit + " обнулён: ");
        printToBinary(changedNumber);
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%10s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

    private static int clearGivenBit(int number, int bitNumber) {
        return number & ~(1 << bitNumber);
    }

}
