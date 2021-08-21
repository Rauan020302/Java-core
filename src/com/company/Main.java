package com.company;

import com.company.commonEnd.CommonEnd;
import com.company.firstLast6.FirstLast6;
import com.company.fix23.Fix23;
import com.company.makeMiddle.MakeMiddle;
import com.company.midThree.MidThree;
import com.company.middleWay.MiddleWay;
import com.company.no23.No23;
import com.company.reverse3.Reverse3;
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

        int[] d = {3,4,5};
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

        int[] f = {1,2,1,2,5,3};
        Unlucky1 unlucky1 = new Unlucky1();
        System.out.println(unlucky1.unlucky1(f));


    }

}
