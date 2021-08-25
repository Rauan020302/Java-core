package com.company;

import com.company.copyEvens.CopyEvens;
import com.company.hasOne.HasOne;
import com.company.scores100.Scores100;
import com.company.scoresClump.ScoresClump;
import com.company.scoresIncreasing.ScoresIncreasing;
import com.company.wordsCount.WordsCount;
import com.company.wordsFront.WordsFront;
import com.company.wordsWithout.WordsWithout;
import com.company.wordsWithoutList.WordsWithoutList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] scores = {1,2,3,4,5,6,9};
        ScoresIncreasing scoresIncreasing = new ScoresIncreasing();
        System.out.println(scoresIncreasing.scoresIncreasing(scores));

        int[] score100 = {1,100,1,109,100};
        Scores100 scores100 = new Scores100();
        System.out.println(scores100.scores100(score100));

        int[] clump = {1,2,3,4};
        System.out.println(ScoresClump.scoresClump(clump));

        String[] word = {"a","bb","ccc","dddd"};
        WordsCount wordsCount = new WordsCount();
        System.out.println(wordsCount.wordsCount(word,2));

        WordsFront wordsFront = new WordsFront();
        System.out.println(Arrays.toString(wordsFront.wordsFront(word, 4)));

        WordsWithoutList wordsWithoutList = new WordsWithoutList();
        System.out.println(wordsWithoutList.wordsWithoutList(word,2));

        HasOne hasOne = new HasOne();
        System.out.println(hasOne.hasOne(245643));

        int[] even = {1,2,3,4};
        CopyEvens copyEvens = new CopyEvens();
        System.out.println(Arrays.toString(copyEvens.copyEvens(even, 2)));

        WordsWithout wordsWithout = new WordsWithout();
        System.out.println(Arrays.toString(wordsWithout.wordsWithout(word, "a")));

    }
}
