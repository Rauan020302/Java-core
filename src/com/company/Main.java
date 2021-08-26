package com.company;

import com.company.firstChar.FirstChar;
import com.company.pairs.Pairs;
import com.company.word0.Word0;
import com.company.wordAppend.WordAppend;
import com.company.wordCount.WordCount;
import com.company.wordLen.WordLen;
import com.company.wordMultiple.WordMultiple;

public class Main {

    public static void main(String[] args) {
        String[] word = {"a","b","c", "b","c","a"};
        Word0 word0 = new Word0();
        System.out.println(word0.word0(word));

        String[] count = {"a","a","a","b","c","b"};
        WordCount wordCount = new WordCount();
        System.out.println(wordCount.wordCount(count));

        WordMultiple wordMultiple = new WordMultiple();
        System.out.println(wordMultiple.wordMultiple(word));

        WordLen wordLen = new WordLen();
        System.out.println(wordLen.wordLen(word));

        String[] arr = {"salt","soda","car","cream","bar"};
        FirstChar firstChar = new FirstChar();
        System.out.println(firstChar.firstChar(arr));

        Pairs pairs = new Pairs();
        System.out.println(pairs.pairs(arr));

        WordAppend wordAppend = new WordAppend();
        System.out.println(wordAppend.wordAppend(word));

    }
}
