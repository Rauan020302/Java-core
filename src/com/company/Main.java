package com.company;

import com.company.atFirst.AtFirst;
import com.company.comboString.ComboString;
import com.company.conCat.ConCat;
import com.company.deFront.DeFront;
import com.company.endsLy.EndsLy;
import com.company.extraEnd.ExtraEnd;
import com.company.extraFront.ExtraFront;
import com.company.firstHalf.FirstHalf;
import com.company.firstTwo.FirstTwo;
import com.company.frontAgain.FrontAgain;
import com.company.hasBad.HasBad;
import com.company.helloName.HelloName;
import com.company.lastChars.LastChars;
import com.company.lastTwo.LastTwo;
import com.company.left2.Left2;
import com.company.makeAbba.MakeAbba;
import com.company.makeOutWord.MakeOutWord;
import com.company.makeTags.MakeTags;
import com.company.middleThree.MiddleThree;
import com.company.middleTwo.MiddleTwo;
import com.company.minCat.MinCat;
import com.company.nTwice.NTwice;
import com.company.nonStart.NonStart;
import com.company.right2.Right2;
import com.company.seeColor.SeeColor;
import com.company.startWord.StartWord;
import com.company.theEnd.TheEnd;
import com.company.twoChar.TwoChar;
import com.company.without2.Without2;
import com.company.withoutEnd.WithoutEnd;
import com.company.withoutEnd2.WithoutEnd2;
import com.company.withoutX.WithoutX;
import com.company.withoutX2.WithoutX2;

public class Main {

    public static void main(String[] args) {
        HelloName helloName = new HelloName();
        System.out.println(helloName.helloName("Rauan"));

        MakeOutWord makeOutWord = new MakeOutWord();
        System.out.println(makeOutWord.makeOutWord("<<>>","world"));

        FirstHalf firstHalf = new FirstHalf();
        System.out.println(firstHalf.firstHalf("WooWoo"));

        NonStart nonStart = new NonStart();
        System.out.println(nonStart.nonStart("Maksut","Rauan"));

        TheEnd theEnd = new TheEnd();
        System.out.println(theEnd.theEnd("Hello",false));

        EndsLy endsLy = new EndsLy();
        System.out.println(endsLy.endsLy("oddlyly"));

        MiddleThree middleThree = new MiddleThree();
        System.out.println(middleThree.middleThree("Candy"));

        LastChars lastChars = new LastChars();
        System.out.println(lastChars.lastChars("",""));

        SeeColor seeColor = new SeeColor();
        System.out.println(seeColor.seeColor("redxxxxx"));

        ExtraFront extraFront = new ExtraFront();
        System.out.println(extraFront.extraFront("ab"));

        StartWord startWord = new StartWord();
        System.out.println(startWord.startWord("hippo","xip"));

        MakeAbba makeAbba = new MakeAbba();
        System.out.println(makeAbba.makeAbba("Hi", "Good"));

        ExtraEnd extraEnd = new ExtraEnd();
        System.out.println(extraEnd.extraEnd("Hello"));

        WithoutEnd withoutEnd = new WithoutEnd();
        System.out.println(withoutEnd.withoutEnd("Hello"));

        Left2 left2 = new Left2();
        System.out.println(left2.left2("java"));

        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        System.out.println(withoutEnd2.withoutEnd2("Hello"));

        NTwice nTwice = new NTwice();
        System.out.println(nTwice.nTwice("Chocolate", 3));

        HasBad hasBad = new HasBad();
        System.out.println(hasBad.hasBad("xbadxxxx"));

        ConCat conCat = new ConCat();
        System.out.println(conCat.conCat("abc","cd"));

        FrontAgain frontAgain = new FrontAgain();
        System.out.println(frontAgain.frontAgain("ed"));

        Without2 without2 = new Without2();
        System.out.println(without2.without2("HelloHe"));

        WithoutX withoutX = new WithoutX();
        System.out.println(withoutX.withoutX("xHix"));

        MakeTags makeTags = new MakeTags();
        System.out.println(makeTags.makeTags("br","Hello"));

        FirstTwo firstTwo = new FirstTwo();
        System.out.println(firstTwo.firstTwo("a"));

        ComboString comboString = new ComboString();
        System.out.println(comboString.comboString("aba","baba"));

        Right2 right2 = new Right2();
        System.out.println(right2.right2("Hello"));

        MiddleTwo middleTwo = new MiddleTwo();
        System.out.println(middleTwo.middleTwo("string"));

        TwoChar twoChar = new TwoChar();
        System.out.println(twoChar.twoChar("java",2));

        AtFirst atFirst = new AtFirst();
        System.out.println(atFirst.atFirst("Hello"));

        LastTwo lastTwo = new LastTwo();
        System.out.println(lastTwo.lastTwo("coding"));

        MinCat minCat = new MinCat();
        System.out.println(minCat.minCat("Hello","java"));

        DeFront deFront = new DeFront();
        System.out.println(deFront.deFront("Hello"));

        WithoutX2 withoutX2 = new WithoutX2();
        System.out.println(withoutX2.withoutX2("xHi"));

    }

}
