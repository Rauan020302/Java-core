package com.company.wordsWithoutList;

import java.util.ArrayList;
import java.util.List;

public class WordsWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() != len)
                list.add(words[i]);
        }

        return list;
    }
}
