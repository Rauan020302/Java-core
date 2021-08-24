package com.company;

import com.company.countEvens.CountEvens;
import com.company.fizzArray.FizzArray;
import com.company.fizzBuzz.FizzBuzz;
import com.company.lucky13.Lucky13;
import com.company.matchUp.MatchUp;
import com.company.modThree.ModThree;
import com.company.no14.No14;
import com.company.post4.Post4;
import com.company.shiftLeft.ShiftLeft;
import com.company.sum13.Sum13;
import com.company.withoutTen.WithoutTen;

import java.io.FileInputStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num = {2,5,10,7,10,9};
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


    }

}
