package homework;

public class Task10 {
    public static void main(String[] args) {
        final int N = 46;
        final int M = 5;

        int capacityOfBlock = M * 9;
        int numOfBlock;
        if (N > 0) {
            numOfBlock = ((N-1) / capacityOfBlock) + 1;
        }

        System.out.printf("Number of the block: %d", numOfBlock);
    }
}
