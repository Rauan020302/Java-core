package com.company;

import com.company.blackjack.Blackjack;
import com.company.closeFar.CloseFar;
import com.company.evenlySpaced.EvenlySpaced;
import com.company.loneSum.LoneSum;
import com.company.luckySum.LuckySum;
import com.company.makeBricks.MakeBricks;
import com.company.makeChocolate.MakeChocolate;
import com.company.noTeenSum.NoTeenSum;
import com.company.roundSum.RoundSum;

public class Main {

    public static void main(String[] args) {
        MakeBricks makeBricks = new MakeBricks();
        System.out.println(makeBricks.makeBricks(3,7,20));

        NoTeenSum noTeenSum = new NoTeenSum();
        System.out.println(noTeenSum.noTeenSum(2,1,17));

        Blackjack blackjack = new Blackjack();
        System.out.println(blackjack.blackjack(11,1));

        LoneSum loneSum = new LoneSum();
        System.out.println(loneSum.loneSum(3,3,3));

        RoundSum roundSum = new RoundSum();
        System.out.println(roundSum.roundSum(16,17,18));

        EvenlySpaced evenlySpaced = new EvenlySpaced();
        System.out.println(evenlySpaced.evenlySpaced(4,6,2));

        LuckySum luckySum = new LuckySum();
        System.out.println(luckySum.luckySum(1,13,3));

        CloseFar closeFar = new CloseFar();
        System.out.println(closeFar.closeFar(4,1,3));

        MakeChocolate makeChocolate = new MakeChocolate();
        System.out.println(makeChocolate.makeChocolate(4,1,6));
    }

}
