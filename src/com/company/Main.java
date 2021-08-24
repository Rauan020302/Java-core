package com.company;

import com.company.addStar.AddStar;
import com.company.copies.Copies;
import com.company.doubling.Doubling;
import com.company.lower.Lower;
import com.company.math1.Math1;
import com.company.moreY.MoreY;
import com.company.noX.NoX;
import com.company.rightDigit.RightDigit;
import com.company.square.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(17);
        num.add(11);
        num.add(19);
        Doubling doubling = new Doubling();
        System.out.println(doubling.doubling(num));

        List<String> str = new ArrayList<>();
        str.add("ax");
        str.add("bbx");
        str.add("ccxc");
        str.add("AaxA");
        Copies copies = new Copies();
        System.out.println(copies.copies3(str));

        RightDigit rightDigit = new RightDigit();
        System.out.println(rightDigit.rightDigit(num));

        Square square = new Square();
        System.out.println(square.square(num));

        MoreY moreY = new MoreY();
        System.out.println(moreY.moreY(str));

        Lower lower = new Lower();
        System.out.println(lower.lower(str));

        AddStar addStar = new AddStar();
        System.out.println(addStar.addStar(str));

        Math1 math1 = new Math1();
        System.out.println(math1.math1(num));

        NoX noX = new NoX();
        System.out.println(noX.noX(str));

    }
}
