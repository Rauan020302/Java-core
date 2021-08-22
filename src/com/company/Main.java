package com.company;

import com.company.blueTicket.BlueTicket;
import com.company.caughtSpeeding.CaughtSpeeding;
import com.company.cigarParty.CigarParty;
import com.company.lastDigit.LastDigit;
import com.company.love6.Love6;
import com.company.maxMod5.MaxMod5;
import com.company.more20.More20;
import com.company.nearTen.NearTen;
import com.company.teaParty.TeaParty;
import com.company.twoAsOne.TwoAsOne;

public class Main {

    public static void main(String[] args) {
        CigarParty cigarParty = new CigarParty();
        System.out.println(cigarParty.cigarParty(30,false));

        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
        System.out.println(caughtSpeeding.caughtSpeeding(60,false));

        Love6 love6 = new Love6();
        System.out.println(love6.love6(1,5));

        More20 more20 = new More20();
        System.out.println(more20.more20(83));

        NearTen nearTen = new NearTen();
        System.out.println(nearTen.nearTen(12));

        TeaParty teaParty = new TeaParty();
        System.out.println(teaParty.teaParty(6,8));

        TwoAsOne twoAsOne = new TwoAsOne();
        System.out.println(twoAsOne.twoAsOne(1,4,3));

        LastDigit lastDigit = new LastDigit();
        System.out.println(lastDigit.lastDigit(24,5,16));

        MaxMod5 maxMod5 = new MaxMod5();
        System.out.println(maxMod5.maxMod5(12,2));

        BlueTicket blueTicket = new BlueTicket();
        System.out.println(blueTicket.blueTicket(6,1,4));

    }
}
