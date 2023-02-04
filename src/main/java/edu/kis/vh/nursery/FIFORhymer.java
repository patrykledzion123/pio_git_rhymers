package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
    
    public DefaultCountingOutRhymer countingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {

        while (!isEmpty())
            countingOutRhymer.countIn(super.countOut());

        int ret = countingOutRhymer.countOut();

        while (!countingOutRhymer.isEmpty())
            countIn(countingOutRhymer.countOut());

        return ret;
    }
}
