package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int arrayPosition = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++arrayPosition] = in;
    }

    public boolean callCheck() {
        return arrayPosition == -1;
    }

    public boolean isFull() {
        return arrayPosition == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[arrayPosition];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[arrayPosition--];
    }

}
