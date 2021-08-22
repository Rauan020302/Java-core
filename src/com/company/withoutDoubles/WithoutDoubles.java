package com.company.withoutDoubles;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles){
        if (die1 < 7 && die2 < 7) {

            if (noDoubles) {
                if (die1 == die2) {
                    return die1 + die2 + 1;
                }
                return die1 + die2;
            }
            return die1 + die2;
        }
        return 100;
    }
}
