package com.company.makeOutWord;

public class MakeOutWord {
    public String makeOutWord(String out, String word){
        String pre = out.substring(0,2);
        String after = out.substring(2,4);

        return pre + word + after;
    }
}
