package com.company;

import com.company.conCat.ConCat;
import com.company.endsLy.EndsLy;
import com.company.extraEnd.ExtraEnd;
import com.company.extraFront.ExtraFront;
import com.company.firstHalf.FirstHalf;
import com.company.frontAgain.FrontAgain;
import com.company.hasBad.HasBad;
import com.company.helloName.HelloName;
import com.company.lastChars.LastChars;
import com.company.left2.Left2;
import com.company.makeAbba.MakeAbba;
import com.company.makeOutWord.MakeOutWord;
import com.company.middleThree.MiddleThree;
import com.company.nTwice.NTwice;
import com.company.nonStart.NonStart;
import com.company.seeColor.SeeColor;
import com.company.startWord.StartWord;
import com.company.theEnd.TheEnd;
import com.company.without2.Without2;
import com.company.withoutEnd.WithoutEnd;
import com.company.withoutEnd2.WithoutEnd2;
import com.company.withoutX.WithoutX;

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


    }

}
