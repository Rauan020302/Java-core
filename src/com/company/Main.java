package com.company;

import com.company.bobThere.BobThere;
import com.company.countCode.CountCode;
import com.company.doubleChar.DoubleChar;
import com.company.prefixAgain.PrefixAgain;
import com.company.repeatEnd.RepeatEnd;
import com.company.sameStartChar.SameStarChar;
import com.company.starOut.StarOut;

public class Main {

    public static void main(String[] args) {
        DoubleChar doubleChar = new DoubleChar();
        System.out.println(doubleChar.doubleChar("The"));

        CountCode countCode = new CountCode();
        System.out.println(countCode.countCode("aacodebbcof"));

        BobThere bobThere = new BobThere();
        System.out.println(bobThere.bobThere("abcbob"));

        RepeatEnd repeatEnd = new RepeatEnd();
        System.out.println(repeatEnd.repeatEnd("Hello",3));

        PrefixAgain prefixAgain = new PrefixAgain();
        System.out.println(prefixAgain.prefixAgain("abXYabc",2));

        SameStarChar sameStarChar = new SameStarChar();
        System.out.println(sameStarChar.sameStarChar("ac*bac"));

        StarOut starOut = new StarOut();
        System.out.println(starOut.starOut("abc**rba"));










    }
}
