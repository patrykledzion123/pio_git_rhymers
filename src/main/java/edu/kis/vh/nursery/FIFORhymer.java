package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
    
    public DefaultCountingOutRhymer countingOutRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            countingOutRhymer.countIn(super.countOut());

        int ret = countingOutRhymer.countOut();

        while (!countingOutRhymer.callCheck())
            countIn(countingOutRhymer.countOut());

        return ret;
    }
}
