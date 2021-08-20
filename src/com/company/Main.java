package com.company;

import com.company.endsLy.EndsLy;
import com.company.extraFront.ExtraFront;
import com.company.firstHalf.FirstHalf;
import com.company.helloName.HelloName;
import com.company.lastChars.LastChars;
import com.company.makeOutWord.MakeOutWord;
import com.company.middleThree.MiddleThree;
import com.company.nonStart.NonStart;
import com.company.seeColor.SeeColor;
import com.company.startWord.StartWord;
import com.company.theEnd.TheEnd;

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







    }

}
