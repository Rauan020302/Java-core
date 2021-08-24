package com.company;

import com.company.bigDiff.BigDiff;
import com.company.countEvens.CountEvens;
import com.company.either24.Either24;
import com.company.evenOdd.EvenOdd;
import com.company.fizzArray.FizzArray;
import com.company.fizzArray2.FizzArray2;
import com.company.fizzArray3.FizzArray3;
import com.company.fizzBuzz.FizzBuzz;
import com.company.has22.Has22;
import com.company.has77.Has77;
import com.company.haveThree.HaveThree;
import com.company.isEveryWhere.IsEveryWhere;
import com.company.lucky13.Lucky13;
import com.company.matchUp.MatchUp;
import com.company.modThree.ModThree;
import com.company.more14.More14;
import com.company.no14.No14;
import com.company.notAlone.NotAlone;
import com.company.only14.Only14;
import com.company.post4.Post4;
import com.company.shiftLeft.ShiftLeft;
import com.company.sum13.Sum13;
import com.company.sum28.Sum28;
import com.company.sum67.Sum67;
import com.company.tenRun.TenRun;
import com.company.tripleUp.TripleUp;
import com.company.withoutTen.WithoutTen;
import com.company.zeroMax.ZeroMax;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {2,2,3,2,2,3,4,5};
        CountEvens countEvens = new CountEvens();
        System.out.println(countEvens.countEvens(num));

        Sum13 sum13 = new Sum13();
        System.out.println(sum13.sum13(num));

        Lucky13 lucky13 = new Lucky13();
        System.out.println(lucky13.lucky13(num));

        FizzArray fizzArray = new FizzArray();
        System.out.println(Arrays.toString(fizzArray.fizzArray(5)));

        No14 no14 = new No14();
        System.out.println(no14.no14(num));

        int[] num1 = {1,2,3,4};
        int[] num2 = {4,1,3,5};
        MatchUp matchUp = new MatchUp();
        System.out.println(matchUp.matchUp(num1,num2));

        ModThree modThree = new ModThree();
        System.out.println(modThree.modThree(num2));

        ShiftLeft shiftLeft = new ShiftLeft();
        System.out.println(Arrays.toString(shiftLeft.shiftLeft(num1)));

        Post4 post4 = new Post4();
        System.out.println(Arrays.toString(post4.post4(num2)));

        WithoutTen withoutTen = new WithoutTen();
        System.out.println(Arrays.toString(withoutTen.withoutTen(num)));

        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(Arrays.toString(fizzBuzz.fizzBuzz(1, 8)));

        BigDiff bigDiff = new BigDiff();
        System.out.println(bigDiff.bigDiff(num));

        Sum67 sum67 = new Sum67();
        System.out.println(sum67.sum67(num));

        Sum28 sum28 = new Sum28();
        System.out.println(sum28.sum28(num));

        int[] only = {1,5,10,7,2,2,3,4};
        Only14 only14 = new Only14();
        System.out.println(only14.only14(only));

        IsEveryWhere isEveryWhere = new IsEveryWhere();
        System.out.println(isEveryWhere.isEverywhere(only,1));

        Has77 has77 = new Has77();
        System.out.println(has77.has77(only));

        HaveThree haveThree = new HaveThree();
        System.out.println(haveThree.haveThree(only));

        TripleUp tripleUp = new TripleUp();
        System.out.println(tripleUp.tripleUp(only));

        TenRun tenRun = new TenRun();
        System.out.println(Arrays.toString(tenRun.tenRun(only)));

        NotAlone notAlone = new NotAlone();
        System.out.println(Arrays.toString(notAlone.notAlone(only, 4)));

        int[] zero = {1,2,3,2,3,2,3};
        ZeroMax zeroMax = new ZeroMax();
        System.out.println(Arrays.toString(zeroMax.zeroMax(zero)));

        Has22 has22 = new Has22();
        System.out.println(has22.has22(zero));

        int[] more = {1,3,1,4,4,4,45,1};
        More14 more14 = new More14();
        System.out.println(more14.more14(more));

        FizzArray2 fizzArray2 = new FizzArray2();
        System.out.println(Arrays.toString(fizzArray2.fizzArray2(4)));

        int[] either = {1,2,2,3,4,4};
        Either24 either24 = new Either24();
        System.out.println(either24.either24(either));

        FizzArray3 fizzArray3 = new FizzArray3();
        System.out.println(Arrays.toString(fizzArray3.fizzArray3(10, 15)));

        int[] even = {1,6,7,5,4,8,9,3,2};
        EvenOdd evenOdd = new EvenOdd();
        System.out.println(Arrays.toString(evenOdd.evenOdd(even)));

    }

}
