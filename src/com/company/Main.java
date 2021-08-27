package com.company;

import com.company.canBalance.CanBalance;
import com.company.countClumps.CountClumps;
import com.company.fix34.Fix34;
import com.company.fix45.Fix45;
import com.company.linearIn.LinearIn;
import com.company.maxMirror.MaxMirror;
import com.company.maxSpan.MaxSpan;
import com.company.seriesUp.SeriesUp;
import com.company.squareUp.SquareUp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {1,2,1,1,3};
        MaxSpan maxSpan = new MaxSpan();
        System.out.println(maxSpan.maxSpan(num));

        int[] balance = {1,1,1,2,1};
        CanBalance canBalance = new CanBalance();
        System.out.println(canBalance.canBalance(balance));

        SeriesUp seriesUp = new SeriesUp();
        System.out.println(Arrays.toString(seriesUp.seriesUp(5)));

        int[] fix = {1,3,1,4};
        Fix34 fix34 = new Fix34();
        System.out.println(Arrays.toString(fix34.fix34(fix)));

        int[] line = {1,2,4,6};
        int[] in = {2,4};
        LinearIn linearIn = new LinearIn();
        System.out.println(linearIn.linearIn(line,in));

        int[] max = {1,2,3,8,9,3,2,1};
        MaxMirror maxMirror = new MaxMirror();
        System.out.println(maxMirror.maxMirror(max));

        int[] nums = {5,4,9,4,9,5};
        Fix45 fix45 = new Fix45();
        System.out.println(Arrays.toString(fix45.fix45(nums)));

        SquareUp squareUp = new SquareUp();
        System.out.println(Arrays.toString(squareUp.squareUp(5)));


        CountClumps countClumps = new CountClumps();
        System.out.println(countClumps.countClumps(balance));


    }
}
