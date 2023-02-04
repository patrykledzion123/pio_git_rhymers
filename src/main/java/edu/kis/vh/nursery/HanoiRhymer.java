package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {
    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }

    //wiersze 4, 11, 13, 14 były źle sformatowane
    //Kombinacje alt+<- oraz alt+-> przełączają między otwartymi kartami (w środowisku intelliJ)
}
