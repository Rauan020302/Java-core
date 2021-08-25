package com.company;

import com.company.mapAB.MapAB;
import com.company.mapAB2.MapAB2;
import com.company.mapAB3.MapAB3;
import com.company.mapAB4.MapAB4;
import com.company.mapBully.MapBully;
import com.company.mapShare.MapShare;
import com.company.topping1.Topping1;
import com.company.topping2.Topping2;
import com.company.topping3.Topping3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","blue");
        map.put("b","red");
        MapBully mapBully = new MapBully();
        System.out.println(mapBully.mapBully(map));

        Map<String,String> top = new HashMap<>();
        top.put("ice cream","sugar");
        top.put("cheese","milk");
        Topping1 topping1 = new Topping1();
        System.out.println(topping1.topping1(top));

        Map<String,String> ab2 = new HashMap<>();
        ab2.put("a","car");
        ab2.put("b","car");
        ab2.put("c","doll");
        MapAB2 mapAB2 = new MapAB2();
        System.out.println(mapAB2.mapAB2(ab2));

        Map<String,String> share = new HashMap<>();
        share.put("a","auto");
        share.put("b","car");
        share.put("c","doll");
        MapShare mapShare = new MapShare();
        System.out.println(mapShare.mapShare(share));

        Map<String,String> top2 = new HashMap<>();
        top2.put("ice cream","sugar");
        top2.put("cheese","milk");
        top2.put("spinach","dirt");
        Topping2 topping2 = new Topping2();
        System.out.println(topping2.topping2(top2));

        Map<String,String> ab3 = new HashMap<>();
        ab3.put("a","car");
        ab3.put("d","car");
        ab3.put("c","doll");
        MapAB3 mapAB3 = new MapAB3();
        System.out.println(mapAB3.mapAB3(ab3));

        MapAB mapAB = new MapAB();
        System.out.println(mapAB.mapAB(share));

        Map<String,String> top3 = new HashMap<>();
        top3.put("potato","chips");
        top3.put("salad","salt");
        Topping3 topping3 = new Topping3();
        System.out.println(topping3.topping3(top3));

        Map<String,String> ab4 = new HashMap<>();
        ab4.put("a","abc");
        ab4.put("b","abcd");
        MapAB4 mapAB4 = new MapAB4();
        System.out.println(mapAB4.mapAB4(ab4));
    }
}
