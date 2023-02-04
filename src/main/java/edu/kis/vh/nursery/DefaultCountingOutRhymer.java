package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int arrayPosition = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++arrayPosition] = in;
    }


    public boolean isEmpty() {
        return arrayPosition == -1;
    }

    public boolean isFull() {
        return arrayPosition == 11;
    }

    protected int getTop() {
        if (isEmpty())
            return -1;
        return numbers[arrayPosition];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[arrayPosition--];
    }

}
