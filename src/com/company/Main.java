package com.company;

import com.company.backAround.BackAround;
import com.company.close10.CloseTen;
import com.company.diff21.Diff;
import com.company.everyNth.EveryNth;
import com.company.hasTeen.Teen;
import com.company.missingChar.MissingChar;
import com.company.mixStart.MixStart;
import com.company.nearHundread.Hundred;
import com.company.sleepIn.SleepIn;
import com.company.startHi.StartHi;
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

        Teen teen = new Teen();
        System.out.println(teen.hasTeen(13,13,12));

        MixStart mixStart = new MixStart();
        System.out.println(mixStart.mixStart("six snacks"));

        CloseTen closeTen = new CloseTen();
        System.out.println(closeTen.closeTen(12,8));

        StringE stringE = new StringE();
        System.out.println(stringE.stringE("asdeeeee"));

        EveryNth everyNth = new EveryNth();
        System.out.println(everyNth.everyNth("rauanmaksut",4));


    }
}
