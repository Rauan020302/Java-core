package com.company.withoutX2;

public class WithoutX2 {
    public String withoutX2(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (i == 0 && str.charAt(i) != 'x')
                result += str.charAt(i);
            else if (i == 1 && str.charAt(i) != 'x')
                result += str.charAt(i);
            else if (i > 1)
                result += str.charAt(i);
        }
        return result;
    }
}
