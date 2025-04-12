package tasks;

public class Task03 {
    public static void main(String[] args) {
        int numOfBit = 4;
        int number = 15;
        int changedNumber = setGivenBit(number, numOfBit);

        System.out.println("Первоначальное число: ");
        printToBinary(number);
        System.out.println("Бит в позиции " + numOfBit + " заполнен: ");
        printToBinary(changedNumber);
    }

    private static int setGivenBit(int number, int bitNumber) {
        return number | (1 << bitNumber);
    }

    private static void printToBinary(int value) {
        System.out.println(String.format("%10s", Integer.
                toBinaryString(value)).replace(' ', '0'));
    }

}
