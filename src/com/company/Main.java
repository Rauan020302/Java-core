package com.company;

import com.company.altPairs.AltPairs;
import com.company.array123.Array123;
import com.company.arrayCount9.ArrayCount9;
import com.company.doubleX.DoubleX;
import com.company.frontTimes.FrontTimes;
import com.company.last2.Last2;
import com.company.noTriples.NoTriples;
import com.company.stringBits.StringBits;
import com.company.stringMatch.StringMatch;
import com.company.stringTimes.StringTimes;
import com.company.stringYak.StringYak;

public class Main {

    public static void main(String[] args) {
//
//        StringTimes stringTimes = new StringTimes();
//        System.out.println(stringTimes.stringTimes("hi",5));
//
//        DoubleX doubleX = new DoubleX();
//        System.out.println(doubleX.doubleX("axxbb"));
//
//        Last2 last2 = new Last2();
//        System.out.println(last2.last2("hixxxhi"));
//
//        int[] nums = {1,2,4,1,2,3,5,6,3};
//        Array123 array123 = new Array123();
//        System.out.println(array123.array123(nums));
//
//        AltPairs altPairs = new AltPairs();
//        System.out.println(altPairs.altPairs("kitten"));
//
//        int[] numbers = {1,2,3,4,4,4,5,6};
//        NoTriples noTriples = new NoTriples();
//        System.out.println(noTriples.noTriples(numbers));

        FrontTimes frontTimes = new FrontTimes();
        System.out.println(frontTimes.frontTimes("Chocolate",4));

        StringBits stringBits = new StringBits();
        System.out.println(stringBits.stringBits("Raauuaann"));

        int[] nums = {1,2,3,4,9,9,9,6,5,9};
        ArrayCount9 arrayCount9 = new ArrayCount9();
        System.out.println(arrayCount9.arrayCount9(nums));

        StringMatch stringMatch = new StringMatch();
        System.out.println(stringMatch.stringMatch("abca","abca"));

        StringYak stringYak = new StringYak();
        System.out.println(stringYak.stringYak("yakbak"));


    }
}
