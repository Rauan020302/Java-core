package com.company;

import com.company.bobThere.BobThere;
import com.company.countCode.CountCode;
import com.company.countHI.CountHi;
import com.company.doubleChar.DoubleChar;
import com.company.endOther.EndOther;
import com.company.oneTwo.OneTwo;
import com.company.plusOut.PlusOut;
import com.company.prefixAgain.PrefixAgain;
import com.company.repeatEnd.RepeatEnd;
import com.company.repeatFront.RepeatFront;
import com.company.sameStartChar.SameStarChar;
import com.company.starOut.StarOut;
import com.company.xyBalance.XYBalance;
import com.company.xyzMiddle.XYZMiddle;

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

        CountHi countHi = new CountHi();
        System.out.println(countHi.countHi("abchiachiachi"));

        EndOther endOther = new EndOther();
        System.out.println(endOther.endOther("AbC","XoaBc"));

        XYBalance xyBalance = new XYBalance();
        System.out.println(xyBalance.xyBalance("aaabby"));

        RepeatFront repeatFront = new RepeatFront();
        System.out.println(repeatFront.repeatFront("Chocolate", 5));

        XYZMiddle xyzMiddle = new XYZMiddle();
        System.out.println(xyzMiddle.xyzMiddle("AxyzBBB"));

        OneTwo oneTwo = new OneTwo();
        System.out.println(oneTwo.oneTwo("abcabc"));

        PlusOut plusOut = new PlusOut();
        System.out.println(plusOut.plusOut("12xy34", "xy"));



    }
}
