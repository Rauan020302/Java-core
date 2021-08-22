package com.company;

import com.company.blueTicket.BlueTicket;
import com.company.caughtSpeeding.CaughtSpeeding;
import com.company.cigarParty.CigarParty;
import com.company.dateFashion.DateFashion;
import com.company.fizzString.FizzString;
import com.company.in1To10.In1To10;
import com.company.inOrder.InOrder;
import com.company.lastDigit.LastDigit;
import com.company.lessBy10.LessBy10;
import com.company.love6.Love6;
import com.company.maxMod5.MaxMod5;
import com.company.more20.More20;
import com.company.nearTen.NearTen;
import com.company.old35.Old35;
import com.company.redTicket.RedTicket;
import com.company.shareDigit.ShareDigit;
import com.company.sortaSum.SortaSum;
import com.company.teaParty.TeaParty;
import com.company.teenSum.TeenSum;
import com.company.twoAsOne.TwoAsOne;

public class Main {

    public static void main(String[] args) {
//        CigarParty cigarParty = new CigarParty();
//        System.out.println(cigarParty.cigarParty(30,false));
//
//        CaughtSpeeding caughtSpeeding = new CaughtSpeeding();
//        System.out.println(caughtSpeeding.caughtSpeeding(60,false));
//
//        Love6 love6 = new Love6();
//        System.out.println(love6.love6(1,5));
//
//        More20 more20 = new More20();
//        System.out.println(more20.more20(83));
//
//        NearTen nearTen = new NearTen();
//        System.out.println(nearTen.nearTen(12));
//
//        TeaParty teaParty = new TeaParty();
//        System.out.println(teaParty.teaParty(6,8));
//
//        TwoAsOne twoAsOne = new TwoAsOne();
//        System.out.println(twoAsOne.twoAsOne(1,4,3));
//
//        LastDigit lastDigit = new LastDigit();
//        System.out.println(lastDigit.lastDigit(24,5,16));
//
//        MaxMod5 maxMod5 = new MaxMod5();
//        System.out.println(maxMod5.maxMod5(12,2));
//
//        BlueTicket blueTicket = new BlueTicket();
//        System.out.println(blueTicket.blueTicket(6,1,4));
//
//        DateFashion dateFashion = new DateFashion();
//        System.out.println(dateFashion.dateFashion(5,2));
//
//        SortaSum sortaSum = new SortaSum();
//        System.out.println(sortaSum.sortaSum(4,10));
//
//        In1To10 in1To10 = new In1To10();
//        System.out.println(in1To10.in1To10(11,true));
//
//        Old35 old35 = new Old35();
//        System.out.println(old35.old35(3));

        TeenSum teenSum = new TeenSum();
        System.out.println(teenSum.teenSum(3,4));

        FizzString fizzString = new FizzString();
        System.out.println(fizzString.fizzString("faafa"));

        InOrder inOrder = new InOrder();
        System.out.println(inOrder.inOrder(1,2,4,false));

        LessBy10 lessBy10 = new LessBy10();
        System.out.println(lessBy10.lessBy10(1,7,11));

        RedTicket redTicket = new RedTicket();
        System.out.println(redTicket.redTicket(2,2,2));

        ShareDigit shareDigit = new ShareDigit();
        System.out.println(shareDigit.shareDigit(12,23));




    }
}
