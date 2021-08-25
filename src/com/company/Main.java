package com.company;

import com.company.bunnyEars2.BunnyEars2;
import com.company.count7.Count7;
import com.company.countHi2.CountHi2;
import com.company.countX.CountX;
import com.company.factorial.Factorial;

public class Main {

    public static void main(String[] args) {
        CountHi2 countHi2 = new CountHi2();
        System.out.println(countHi2.countHi2("ahiahi"));

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));

        BunnyEars2 bunnyEars2 = new BunnyEars2();
        System.out.println(bunnyEars2.bunnyEars2(5));

        Count7 count7 = new Count7();
        System.out.println(count7.count7(717));

        CountX countX = new CountX();
        System.out.println(countX.countX("xiaxiaxiax"));
    }
}
