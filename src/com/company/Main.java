package com.company;

import com.company.biggerTwo.BiggerTwo;
import com.company.commonEnd.CommonEnd;
import com.company.double23.Double23;
import com.company.firstLast6.FirstLast6;
import com.company.fix23.Fix23;
import com.company.front11.Front11;
import com.company.frontPiece.FrontPiece;
import com.company.has23.Has23;
import com.company.make2.Make2;
import com.company.makeEnds.MakeEnds;
import com.company.makeLast.MakeLast;
import com.company.makeMiddle.MakeMiddle;
import com.company.makePi.MakePi;
import com.company.maxEnd3.MaxEnd3;
import com.company.maxTriple.MaxTriple;
import com.company.midThree.MidThree;
import com.company.middleWay.MiddleWay;
import com.company.no23.No23;
import com.company.plusTwo.PlusTwo;
import com.company.reverse3.Reverse3;
import com.company.rotateLeft3.RotateLeft3;
import com.company.sameFirstLast.SameFirstLast;
import com.company.start1.Start1;
import com.company.sum2.Sum2;
import com.company.sum3.Sum3;
import com.company.swapEnds.SwapEnds;
import com.company.unlucky1.Unlucky1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,34,5};
        FirstLast6 firstLast6 = new FirstLast6();
        System.out.println(firstLast6.firstLast6(a));

        int[] b = {2,3,4,5,6};
        CommonEnd commonEnd = new CommonEnd();
        System.out.println(commonEnd.commonEnd(a,b));

        int[] c = {1,2,3};
        Reverse3 reverse3 = new Reverse3();
        System.out.println(Arrays.toString(reverse3.reverse3(c)));

        int[] d = {1,11,4};
        MiddleWay middleWay = new MiddleWay();
        System.out.println(Arrays.toString(middleWay.middleWay(c, d)));

        int[] e = {2,4};
        No23 no23 = new No23();
        System.out.println(no23.no23(e));

        Fix23 fix23 = new Fix23();
        System.out.println(Arrays.toString(fix23.fix23(c)));

        MakeMiddle makeMiddle = new MakeMiddle();
        System.out.println(Arrays.toString(makeMiddle.makeMiddle(a)));

        MidThree midThree = new MidThree();
        System.out.println(Arrays.toString(midThree.midThree(b)));

        int[] f = {1,2,1,2,5,1};
        Unlucky1 unlucky1 = new Unlucky1();
        System.out.println(unlucky1.unlucky1(f));

        SameFirstLast sameFirstLast = new SameFirstLast();
        System.out.println(sameFirstLast.sameFirstLast(f));

        Sum3 sum3 = new Sum3();
        System.out.println(sum3.sum3(d));

        MaxEnd3 maxEnd3 = new MaxEnd3();
        System.out.println(Arrays.toString(maxEnd3.maxEnd3(d)));

        MakeEnds makeEnds = new MakeEnds();
        System.out.println(Arrays.toString(makeEnds.makeEnds(f)));

        MakeLast makeLast = new MakeLast();
        System.out.println(Arrays.toString(makeLast.makeLast(d)));

        int[] h = {2,3};
        int[] i = {4,1};
        Start1 start1 = new Start1();
        System.out.println(start1.start1(h,i));

        PlusTwo plusTwo = new PlusTwo();
        System.out.println(Arrays.toString(plusTwo.plusTwo(h, i)));

        MaxTriple maxTriple = new MaxTriple();
        System.out.println(maxTriple.maxTriple(d));

        int[] j = new int[0];
        Make2 make2 = new Make2();
        System.out.println(Arrays.toString(make2.make2(j, i)));

        MakePi makePi = new MakePi();
        System.out.println(Arrays.toString(makePi.makePi()));

        RotateLeft3 rotateLeft3 = new RotateLeft3();
        System.out.println(Arrays.toString(rotateLeft3.rotateLeft3(d)));

        Sum2 sum2 = new Sum2();
        System.out.println(sum2.sum2(i));

        Has23 has23 = new Has23();
        System.out.println(has23.has23(i));

        Double23 double23 = new Double23();
        System.out.println(double23.double23(i));

        BiggerTwo biggerTwo = new BiggerTwo();
        System.out.println(Arrays.toString(biggerTwo.biggerTwo(i,h)));

        int[] k = {1,2,3,4,5};
        SwapEnds swapEnds = new SwapEnds();
        System.out.println(Arrays.toString(swapEnds.swapEnds(k)));

        FrontPiece frontPiece = new FrontPiece();
        System.out.println(Arrays.toString(frontPiece.frontPiece(i)));

        Front11 front11 = new Front11();
        System.out.println(Arrays.toString(front11.front11(k, i)));



    }

}
