package com.company;

import com.company.backAround.BackAround;
import com.company.close10.CloseTen;
import com.company.diff21.Diff;
import com.company.everyNth.EveryNth;
import com.company.frontBack.FrontBack;
import com.company.hasTeen.Teen;
import com.company.icyHot.IcyHot;
import com.company.in3050.In3050;
import com.company.lastDigit.LastDigit;
import com.company.loneTeen.LoneTeen;
import com.company.missingChar.MissingChar;
import com.company.mixStart.MixStart;
import com.company.monkeyTrouble.MonkeyTrouble;
import com.company.nearHundread.Hundred;
import com.company.or35.Or35;
import com.company.parrotTrouble.ParrotTrouble;
import com.company.posNeg.PosNeg;
import com.company.sleepIn.SleepIn;
import com.company.startHi.StartHi;
import com.company.startOz.StartOz;
import com.company.stringE.StringE;

public class Main {

    public static void main(String[] args) {

//        SleepIn sleepIn = new SleepIn();
//        System.out.println(sleepIn.sleepIn(true,true));
//
//        Diff diff = new Diff();
//        System.out.println(diff.diff21(10));
//
//        Hundred hundred = new Hundred();
//        System.out.println(hundred.nearHundred(200));
//
//        MissingChar missingChar = new MissingChar();
//        System.out.println(missingChar.missingChar("Kitten",4));
//
//        BackAround backAround = new BackAround();
//        System.out.println(backAround.backAround("car"));
//
//        StartHi startHi = new StartHi();
//        System.out.println(startHi.startHi("ha hello"));
//
//        Teen teen = new Teen();
//        System.out.println(teen.hasTeen(13,13,12));
//
//        MixStart mixStart = new MixStart();
//        System.out.println(mixStart.mixStart("six snacks"));
//
//        CloseTen closeTen = new CloseTen();
//        System.out.println(closeTen.closeTen(12,8));
//
//        StringE stringE = new StringE();
//        System.out.println(stringE.stringE("asdeeeee"));
//
//        EveryNth everyNth = new EveryNth();
//        System.out.println(everyNth.everyNth("rauanmaksut",4));

        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        System.out.println(monkeyTrouble.monkeyTrouble(false,false));

        ParrotTrouble parrotTrouble = new ParrotTrouble();
        System.out.println(parrotTrouble.parrotTrouble(false,6));

        PosNeg posNeg = new PosNeg();
        System.out.println(posNeg.posNeg(-1, -1, false));

        FrontBack frontBack = new FrontBack();
        System.out.println(frontBack.frontBack("rauan"));

        Or35 or35 = new Or35();
        System.out.println(or35.or35(23));

        IcyHot icyHot = new IcyHot();
        System.out.println(icyHot.icyHot(1000,101));

        LoneTeen loneTeen = new LoneTeen();
        System.out.println(loneTeen.loneTeen(13,99));

        StartOz startOz = new StartOz();
        System.out.println(startOz.startOz("ozozoz"));

        In3050 in3050 = new In3050();
        System.out.println(in3050.in3050(30,34));

        LastDigit lastDigit = new LastDigit();
        System.out.println(lastDigit.lastDigit(124,33));
    }
}
